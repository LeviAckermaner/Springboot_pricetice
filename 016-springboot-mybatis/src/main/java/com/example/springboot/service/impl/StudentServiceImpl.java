package com.example.springboot.service.impl;

import com.example.springboot.dao.StudentMapper;
import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shishuaiyang
 * @date 2021/11/26-下午4:14
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student queryStudent(Integer id) {
        return studentMapper.selectStudentById(id);
    }
}
