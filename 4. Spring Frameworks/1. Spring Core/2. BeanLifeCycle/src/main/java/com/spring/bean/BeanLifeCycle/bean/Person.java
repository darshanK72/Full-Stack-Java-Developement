package com.spring.bean.BeanLifeCycle.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
	private String name;
	private int rollNo;
	
	public Person() {
		super();
	}
	public Person(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@PostConstruct
	public void destroy(){
		System.out.println("Creating Person Bean");
	}

	@PreDestroy
	public void afterPropertiesSet(){
		System.out.println("Destroying Person Bean");		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rollNo=" + rollNo + "]";
	}
}
