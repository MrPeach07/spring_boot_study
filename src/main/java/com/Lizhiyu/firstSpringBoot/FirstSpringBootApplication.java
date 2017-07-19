package com.Lizhiyu.firstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstSpringBootApplication {

	@RequestMapping("/")
		String index() {
		return "hello spring boot!";
	}
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}
}
