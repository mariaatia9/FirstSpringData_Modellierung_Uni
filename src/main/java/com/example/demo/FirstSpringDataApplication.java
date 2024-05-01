package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan
@EntityScan(basePackages = "com.example.entity.unidirektional")
@EnableJpaRepositories(basePackages = "com.example.repository")
public class FirstSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringDataApplication.class, args);
	}

}
