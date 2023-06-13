package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class WebServiceApiTestApplication {

	public static void main(String[] args) {
		System.out.println("WebSerive API Test");
		SpringApplication.run(WebServiceApiTestApplication.class, args);
	}

}
