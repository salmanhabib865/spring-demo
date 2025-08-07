package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HttpTohttpsApplication {
	
	@GetMapping("/firstDemo")
	public String firstDemo() {
		return "Demo for HTTP to HTTPS";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(HttpTohttpsApplication.class, args);
	}

}
