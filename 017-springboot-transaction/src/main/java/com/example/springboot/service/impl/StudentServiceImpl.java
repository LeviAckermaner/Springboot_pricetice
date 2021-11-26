package com.example.springboot.service.impl;

import com.example.springboot.dao.StudentMapper;
import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author shishuaiyang
 * @date 2021/11/26-下午5:24
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public void addStudent(Student student) {
        studentMapper.insert(student);
        System.out.println("插入语句执行");
    }
}
