package com.spring.bean.BeanLifeCycle.bean;

public class Student {
	
	private String name;
	private int rollNo;
	
	public Student() {
		super();
	}
	public Student(String name, int rollNo) {
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
	
	public void init()
	{
		System.out.println("Creating Student Bean");
	}
	
	public void destroy()
	{
		System.out.println("Destroying Student Bean");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	

}
