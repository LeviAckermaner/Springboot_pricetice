package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shishuaiyang
 * @date 2021/11/25-下午7:34
 */
@Controller
public class Hello {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoot(){
        return "hello Spring Boot";
    }
}
