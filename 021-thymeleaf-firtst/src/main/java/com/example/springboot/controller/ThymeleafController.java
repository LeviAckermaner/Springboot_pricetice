package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shishuaiyang
 * @date 2021/11/28-下午2:09
 */
@Controller
public class ThymeleafController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("data","从controller传递过来的数据");
        return "hello";
    }
}
