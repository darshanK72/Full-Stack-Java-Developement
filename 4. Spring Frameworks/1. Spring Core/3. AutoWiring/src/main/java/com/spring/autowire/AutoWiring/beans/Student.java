package com.spring.autowire.AutoWiring.beans;

public class Student {
	
	private int rollNo;
	private String name;
	private long phone;
	private Address address;
	
	public Student() {
		super();
	}
	
	public Student(int rollNo, String name, long phone, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.phone = phone;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	

}
