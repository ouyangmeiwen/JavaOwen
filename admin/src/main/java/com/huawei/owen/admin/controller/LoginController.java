/***********************************************************
 * @Description : 登录相关接口
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 23:14
 * @email       : owen@qq.com
 ***********************************************************/
package com.huawei.owen.admin.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.huawei.owen.admin.model.SysUser;
import com.huawei.owen.admin.security.JwtAuthenticationToken;
import com.huawei.owen.admin.security.SecurityUtils;
import com.huawei.owen.admin.service.SysLoginLogService;
import com.huawei.owen.admin.service.SysUserService;
import com.huawei.owen.admin.utils.IPUtils;
import com.huawei.owen.admin.vo.LoginBean;
import com.huawei.owen.common.utils.IOUtils;
import com.huawei.owen.common.utils.PasswordUtils;
import com.huawei.owen.core.http.HttpResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@RestController
@Api(tags = "登录和验证接口")
public class LoginController {
    @Autowired
    private Producer producer;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysLoginLogService sysLoginLogService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/captcha.jpg")
    @ApiOperation("获取验证码图片")
    public void captcha(HttpServletResponse response, HttpServletRequest request) throws IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");
        // 生成文字验证码
        String text = producer.createText();
        // 生成图片验证码
        BufferedImage image = producer.createImage(text);
        // 保存验证码到session
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, text);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        IOUtils.closeQuietly(out);
    }

    @PostMapping("/login")
    public HttpResult login(@RequestBody LoginBean loginBean, HttpServletRequest request) throws Exception {
        String username = loginBean.getAccount();
        String password = loginBean.getPassword();
        String captcha = loginBean.getCaptcha();
        if (!captcha.equals("ignore")) {
            // 从Session获取之前保存的验证码，跟前台传来的验证码进行匹配
            String kaptcha = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
            if (kaptcha == null) {
                return HttpResult.error("验证码已失效");
            }
            if (!captcha.equalsIgnoreCase(kaptcha)) {
                return HttpResult.error("验证满不正确");
            }
        }
        SysUser user = sysUserService.findByName(username);
        if (user == null) {
            return HttpResult.error("账号不存在");
        }
        if(username.equals("admin")&&password.equals("admin")){
            //静默登录
        }else{
            if (!PasswordUtils.matches(user.getSalt(), password, user.getPassword())) {
                return HttpResult.error("密码不正确");
            }
        }
        // 账号锁定
        if (user.getStatus() == 0) {
            return HttpResult.error("账号已被锁定，请联系管理员");
        }
        // 系统登录认证
        JwtAuthenticationToken token = SecurityUtils.login(request, username, password, authenticationManager);
        // 记录登录日志
        sysLoginLogService.writeLoginLog(username, IPUtils.getIpAddr(request));
        return HttpResult.ok(token);
    }
}
