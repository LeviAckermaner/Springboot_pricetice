package com.example.springboot;

import com.example.springboot.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Resource
	private HelloService helloService;

	public static void main(String[] args) {
		System.out.println("准备创建容器");
		SpringApplication.run(Application.class, args);
		System.out.println("容器创建完毕");
	}


	@Override
	public void run(String... args) throws Exception {
		//容器创建好，执行run方法
		String alice = helloService.sayHello("alice");
		System.out.println(alice);
	}
}
