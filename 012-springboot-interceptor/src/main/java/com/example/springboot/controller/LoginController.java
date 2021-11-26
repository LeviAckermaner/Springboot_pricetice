package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shishuaiyang
 * @date 2021/11/26-上午9:58
 */
@Controller
public class LoginController {
    @RequestMapping("/user/login")
    @ResponseBody
    public String login(){
        return "user login";
    }

    @RequestMapping("/user/account")
    @ResponseBody
    public String account(){
        return "user account";
    }
}
