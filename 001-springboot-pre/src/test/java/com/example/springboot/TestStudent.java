package com.example.springboot;

import com.example.springboot.config.SpringConfig;
import com.example.springboot.pojo.Cat;
import com.example.springboot.pojo.Student;
import com.example.springboot.pojo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shishuaiyang
 * @date 2021/11/25-下午4:23
 */
public class TestStudent {
    @Test
    public void test01(){
        String config = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student student = (Student)context.getBean("myConfig");
        System.out.println(student);
    }

    @Test
    public void test02(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student)context.getBean("createStudent");
        System.out.println(student);
    }

    @Test
    public void test03(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) context.getBean("myCat");
        System.out.println(cat);
    }

    @Test
    public void test04(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = (Tiger) context.getBean("tiger");
        System.out.println(tiger);
    }
}
