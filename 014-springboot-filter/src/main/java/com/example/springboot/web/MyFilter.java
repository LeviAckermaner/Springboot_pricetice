package com.example.springboot.web;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author shishuaiyang
 * @date 2021/11/26-上午10:41
 */
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter -> doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
