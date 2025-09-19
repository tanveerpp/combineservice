package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CobineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CobineServiceApplication.class, args);
	}
	@Bean
	public static RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}
