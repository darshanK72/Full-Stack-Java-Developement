package com.spring.javaconfig.JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.javaconfig.JavaConfiguration.bean.Student;

@Configuration
public class JavaConfig {
	
	@Bean
	public Student getStudent()
	{
		Student student =  new Student();
		return student;
	}
}
