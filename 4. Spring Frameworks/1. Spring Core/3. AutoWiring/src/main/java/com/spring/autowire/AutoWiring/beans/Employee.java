package com.spring.autowire.AutoWiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee{
	
	private String name;
	private int rollNo;
	
	@Autowired
	@Qualifier("address1")
	private Address address;
	
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int rollNo, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
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

	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rollNo=" + rollNo + ", address=" + address + "]";
	}
	
	
	

}
