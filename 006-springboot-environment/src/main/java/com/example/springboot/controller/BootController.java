package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shishuaiyang
 * @date 2021/11/25-下午8:03
 */
@Controller
public class BootController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello properties";
    }
}
