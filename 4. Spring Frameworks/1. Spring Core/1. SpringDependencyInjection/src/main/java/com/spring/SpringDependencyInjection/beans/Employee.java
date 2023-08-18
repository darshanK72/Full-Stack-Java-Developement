package com.spring.SpringDependencyInjection.beans;

public class Employee {
	private int employeeId;
	private String name;
	private Address address;
	public Employee(int employeeId, String name, Address address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.address = address;
	}
	public Employee() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
		
	public void display()
	{
		System.out.println("Name : " + this.getName());
		System.out.println("Address : " + this.getAddress().getStreet() + ", " + this.getAddress().getCity());
	}
	
	
}
