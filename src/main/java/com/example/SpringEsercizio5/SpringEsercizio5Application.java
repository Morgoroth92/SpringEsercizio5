package com.example.SpringEsercizio5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringEsercizio5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEsercizio5Application.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/v1/getName").allowedOrigins("http://localhost:8080");
				registry.addMapping("/v1/reverseName").allowedOrigins("http://localhost:8080");
			}
		};

	}
}
