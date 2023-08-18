package com.springboot;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class SpringBootFileUploadApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringBootFileUploadApplication.class, args);
	}

}
