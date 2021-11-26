package com.example.springboot.service.impl;

import com.example.springboot.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author shishuaiyang
 * @date 2021/11/26-上午9:14
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
