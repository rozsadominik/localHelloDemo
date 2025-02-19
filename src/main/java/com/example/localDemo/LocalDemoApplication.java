package com.example.localDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LocalDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalDemoApplication.class, args);
	}
	@GetMapping("/sayHello")
	public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s, we meet at last!", name);
	}
}
