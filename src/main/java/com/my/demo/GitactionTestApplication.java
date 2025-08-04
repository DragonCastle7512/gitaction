package com.my.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class GitactionTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitactionTestApplication.class, args);
	}
	@GetMapping("/")
	public String index() {
		return "My Web";
	}
}
