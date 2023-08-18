package com.spring.bean.BeanLifeCycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
	
	private String name;
	private int rollNo;
	
	public Employee() {
		super();
	}
	public Employee(String name, int rollNo) {
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

	public void destroy() throws Exception {
		System.out.println("Destroying Employee Bean");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Creating Employee Bean");		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	

}
