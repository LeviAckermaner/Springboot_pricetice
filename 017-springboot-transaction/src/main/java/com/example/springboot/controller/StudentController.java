package com.example.springboot.controller;

import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author shishuaiyang
 * @date 2021/11/26-下午5:27
 */
@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/add")
    @ResponseBody
    public String addStudent(String name, Integer age){
        Student student = new Student(null, name, age);
        studentService.addStudent(student);
        return "添加成功";
    }
}
