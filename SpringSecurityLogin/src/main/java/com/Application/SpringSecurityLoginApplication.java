package com.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecurityLoginApplication {

	@GetMapping("/message")
	public String Message() {
		return "Welcome to OuthWorld";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityLoginApplication.class, args);
	}

}
