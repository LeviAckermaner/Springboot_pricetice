package com.example.springboot.config;

import com.example.springboot.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author shishuaiyang
 * @date 2021/11/26-上午9:56
 */
@Configuration
public class MyAppConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LoginInterceptor loginInterceptor = new LoginInterceptor();
        registry.addInterceptor(loginInterceptor).
                addPathPatterns("/user/**").
                excludePathPatterns("/user/login");
    }
}
