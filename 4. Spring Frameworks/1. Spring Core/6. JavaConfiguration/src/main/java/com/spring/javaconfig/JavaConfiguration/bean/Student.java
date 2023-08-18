package com.spring.javaconfig.JavaConfiguration.bean;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("1001")
	private int rollNo;
	
	@Value("Darshan Khairnar")
	private String name;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
	

}
