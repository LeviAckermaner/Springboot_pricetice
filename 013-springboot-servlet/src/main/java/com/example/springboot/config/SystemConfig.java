package com.example.springboot.config;

import com.example.springboot.web.MyServlet;
import org.springframework.boot.web.servlet.RegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shishuaiyang
 * @date 2021/11/26-上午10:25
 */
@Configuration
public class SystemConfig {

    @Bean
    public ServletRegistrationBean createRegistrationBean(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet(),"/myservlet");
        return registrationBean;
    }

}
