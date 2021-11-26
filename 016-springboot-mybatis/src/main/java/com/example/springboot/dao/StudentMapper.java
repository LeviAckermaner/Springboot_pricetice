package com.example.springboot.dao;

import com.example.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shishuaiyang
 * @date 2021/11/26-下午4:08
 */

/**
 * @Mapper告诉MyBatis dao接口的位置，需要为该接口创建代理对象
 */
//@Mapper
public interface StudentMapper {
    Student selectStudentById(@Param("stuId") Integer id);
}
