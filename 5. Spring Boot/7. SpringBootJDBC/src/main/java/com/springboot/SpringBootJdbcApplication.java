package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.dao.UserDao;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner{
	
	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(this.userDao.createTable());
//	System.out.println(this.userDao.insert(3, "Krushna", "Khairnar"));
//	this.userDao.insert(4, "Aakash", "Khairnar");
//	this.userDao.insert(5, "Abhishek", "Khairnar");
	}

}
