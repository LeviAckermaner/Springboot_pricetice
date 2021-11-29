package com.example.springboot.controller;

import com.example.springboot.model.SysUser;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shishuaiyang
 * @date 2021/11/28-下午2:41
 */
@Controller
@RequestMapping("/tpl")
public class ThymeleafController {

    @GetMapping("/expression1")
    public String expression1(Model model){
        model.addAttribute("data","从Controller传递过来的data");
        SysUser sysUser = new SysUser(1, "alice", "femamle", 18);
        model.addAttribute("myUser",sysUser);
        return "expression1";
    }

    @GetMapping("/expression2")
    public String expression2(Model model){
        model.addAttribute("data","从Controller传递过来的data");
        SysUser sysUser = new SysUser(1, "alice", "femamle", 18);
        model.addAttribute("myUser",sysUser);
        return "expression2";
    }
    @GetMapping("/link")
    public String link(Model model){
        model.addAttribute("userId",1);
        return "link";
    }

    @GetMapping("/queryAccount")
    @ResponseBody
    public String queryAccount(){
        return "queryAccount";
    }

    @GetMapping("/eachList")
    public String eachList(Model model){
        List<SysUser> sysUserList = new ArrayList<>();
        sysUserList.add(new SysUser(1,"张三","male",20));
        sysUserList.add(new SysUser(1,"李四","male",20));
        sysUserList.add(new SysUser(1,"王五","male",20));
        model.addAttribute("myUsers",sysUserList);
        return "eachList";
    }

    @GetMapping("/eachMap")
    public String eachMap(Model model){
        Map<String,SysUser> myMap = new HashMap<>();
        myMap.put("stu1",new SysUser(1,"马超","male",20));
        myMap.put("stu2",new SysUser(1,"黄忠","male",20));
        myMap.put("stu3",new SysUser(1,"赵云","male",20));
        model.addAttribute("myMap",myMap);
        return "eachMap";
    }
}
