package com.example.springboot.config;

import com.example.springboot.web.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;

/**
 * @author shishuaiyang
 * @date 2021/11/26-上午10:43
 */
@Configuration
public class MyWebApplicationConfig {
    @Bean
    public FilterRegistrationBean createFilterRegistrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.addUrlPatterns("/user/*");
        return registrationBean;
    }
}
