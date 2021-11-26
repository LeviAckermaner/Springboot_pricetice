package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shishuaiyang
 * @date 2021/11/25-下午9:36
 */
@Controller
public class JspController {

    @RequestMapping("/dojsp")
    public String doJsp(Model model){
        model.addAttribute("data","jsp data");
        return "index";
    }
}
