package com.example.firstweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstwebApplication {
	
	public String PORT = System.getenv("PORT");

	public static void main(String[] args) {
		SpringApplication.run(FirstwebApplication.class, args);
	}

}
