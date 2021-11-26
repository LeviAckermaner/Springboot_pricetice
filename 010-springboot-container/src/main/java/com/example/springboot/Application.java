package com.example.springboot;

import com.example.springboot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		UserService userServiceImpl = (UserService) applicationContext.getBean("userServiceImpl");
		userServiceImpl.sayHello("good");
	}

}
