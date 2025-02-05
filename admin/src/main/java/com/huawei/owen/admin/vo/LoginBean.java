/***********************************************************
 * @Description : 登录时的传参
 * @author      : 大神(hhh)
 * @date        : 2019/11/18 7:58
 * @email       : owen@qq.com
 ***********************************************************/
package com.huawei.owen.admin.vo;

import lombok.Data;

@Data
public class LoginBean {
    String account;
    String password;
    String captcha;
}
