package com.spring.SpringDependencyInjection.beans;

public class Student {
	
	private int rollNo;
	private String name;
	private float marks;
	private char div;
	private String address;
	
	public Student() {
		super();
	}
	public Student(int rollNo, String name, float marks, char div, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.div = div;
		this.address = address;
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public char getDiv() {
		return div;
	}
	public void setDiv(char div) {
		this.div = div;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", div=" + div + ", address="
				+ address + "]";
	}
	
	
	

}
