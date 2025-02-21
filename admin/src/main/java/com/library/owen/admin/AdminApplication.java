/***********************************************************
 * @Description : admin的入口类
 * @author      : 大神(hhh)
 * @date        : 2019/11/17 0:02
 * @email       : owen@qq.com
 ***********************************************************/
package com.library.owen.admin;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.library.owen.admin.mapper")
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
        String url = "http://localhost:9528/api/swagger-ui.html";
        System.out.println(url);
        try {
            // 使用系统的命令行打开默认浏览器
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            } else {
                System.out.println("当前操作系统不支持此方式");
            }
        } catch (IOException e) {
            System.out.println("无法打开浏览器: " + e.getMessage());
        }
    }

}
