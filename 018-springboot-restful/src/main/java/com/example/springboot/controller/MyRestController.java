package com.example.springboot.controller;

import com.example.springboot.model.Student;
import org.springframework.web.bind.annotation.*;

/**
 * @author shishuaiyang
 * @date 2021/11/26-下午8:14
 */
@RestController
public class MyRestController {
    @GetMapping("/student/{id}")
    public String getStudent(@PathVariable("id") Integer stuId){
        return "query student, student id ->" + stuId;
    }

    @PostMapping("/student")
    public String updateStudent(Student student){
        return "update -> "+ student.toString();
    }
    @PutMapping("/student")
    public String putStudent(Student student){
        return "create student, stuId ->"+student.toString();
    }
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") Integer stuId){
        return "delete student, stuId ->"+stuId;
    }
}
