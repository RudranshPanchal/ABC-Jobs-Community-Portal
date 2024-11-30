package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class Ass3WdfApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ass3WdfApplication.class, args);
	}

}
