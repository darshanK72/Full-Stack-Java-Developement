package com.spring.stereotype.StereotypeAnnotation.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("101")
	private int rollNo;
	
	@Value("Darshan Khainrar")
	private String name;
	
	@Value("phones")
	private List<String> phones;
	
	@Value("#{address}")
	private Address address;
	
	public Student() {
		super();
	}
	
	public Student(int rollNo, String name, List<String> phones, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.phones = phones;
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
	public List<String> getPhone() {
		return phones;
	}
	public void setPhone(List<String> phones) {
		this.phones = phones;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", phone=" + phones + ", address=" + address + "]";
	}
	
	

}
