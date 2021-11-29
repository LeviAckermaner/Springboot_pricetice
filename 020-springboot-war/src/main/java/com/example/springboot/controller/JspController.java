package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shishuaiyang
 * @date 2021/11/27-下午4:36
 */
@Controller
public class JspController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("data","mydata");
        return "index";
    }
}
