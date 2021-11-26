package com.example.springboot.config;

import com.example.springboot.web.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.ServletRegistration;

/**
 * @author shishuaiyang
 * @date 2021/11/26-上午11:05
 */
@Configuration
public class MyApplicationConfig {
    @Bean
    public ServletRegistrationBean createServletRegistrationBean(){
        ServletRegistrationBean registrationBean =
                new ServletRegistrationBean(new MyServlet(),"/myservlet");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean reg = new FilterRegistrationBean();

        //使用框架中的过滤器类
        CharacterEncodingFilter filter  = new CharacterEncodingFilter();
        //指定使用的编码方式
        filter.setEncoding("utf-8");
        //指定request ， response都使用encoding的值
        filter.setForceEncoding(true);

        reg.setFilter(filter);
        //指定 过滤的url地址
        reg.addUrlPatterns("/*");


        return reg;
    }
}
