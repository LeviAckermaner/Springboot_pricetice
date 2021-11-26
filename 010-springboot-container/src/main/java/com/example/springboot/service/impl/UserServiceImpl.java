package com.example.springboot.service.impl;

import com.example.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author shishuaiyang
 * @date 2021/11/26-上午8:48
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("uservice sayHello->"+name);
    }
}
