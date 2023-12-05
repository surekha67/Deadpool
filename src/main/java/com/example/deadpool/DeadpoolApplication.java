package com.example.deadpool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeadpoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeadpoolApplication.class, args);
		System.out.println("Hello");
	}

}
