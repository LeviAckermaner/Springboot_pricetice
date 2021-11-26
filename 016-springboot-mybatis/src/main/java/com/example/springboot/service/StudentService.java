package com.example.springboot.service;

import com.example.springboot.model.Student;

/**
 * @author shishuaiyang
 * @date 2021/11/26-下午4:13
 */
public interface StudentService {
    Student queryStudent(Integer id);
}
