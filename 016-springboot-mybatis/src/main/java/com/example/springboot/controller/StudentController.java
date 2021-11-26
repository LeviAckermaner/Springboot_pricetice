package com.example.springboot.controller;

import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author shishuaiyang
 * @date 2021/11/26-下午4:17
 */
@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/student/query")
    @ResponseBody
    public String queryStudent(Integer id){
        Student student = studentService.queryStudent(id);
        return student.toString();
    }
}
