package com.example.springboot.controller;

import com.example.springboot.pojo.Author;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author shishuaiyang
 * @date 2021/11/25-下午8:55
 */
@Controller
public class HelloController {
    @Value("${server.port}")
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${author.name}")
    private String name;

    @Value("${author.age}")
    private Integer age;

    @Resource
    private Author author;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "author ->" +author;
    }
}
