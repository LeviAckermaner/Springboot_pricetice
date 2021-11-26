package com.example.springboot.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author shishuaiyang
 * @date 2021/11/25-下午5:04
 */
@Component("tiger")
public class Tiger {
    @Value("${tiger.name}")
    private String  name;

    @Value("${tiger.age}")
    private Integer age;

    @Override
    public String toString() {
        return "Tiger{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
