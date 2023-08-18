package com.spring.SpringDependencyInjection.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Company {
	
	private String name;
	private List<String> employeeList;
	private Set<Long> phoneList;
	private Map<String,String> managerList;
	
	public Company() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<String> employeeList) {
		this.employeeList = employeeList;
	}

	public Set<Long> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(Set<Long> phoneList) {
		this.phoneList = phoneList;
	}

	public Map<String, String> getManagerList() {
		return managerList;
	}

	public void setManagerList(Map<String, String> managerList) {
		this.managerList = managerList;
	}

	public Company(String name, List<String> employeeList, Set<Long> phoneList, Map<String, String> managerList) {
		super();
		this.name = name;
		this.employeeList = employeeList;
		this.phoneList = phoneList;
		this.managerList = managerList;
	}
	
	public void display()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Company Name : " + this.name);
		System.out.println("--------------------------------------------------------");
		System.out.println("Employees ");
		for(String emp : this.employeeList)
		{
			System.out.println(emp);
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("Phone List");
		for(Long phone:this.phoneList)
		{
			System.out.println(phone);
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("Managers");
		for(Map.Entry<String, String> entry: managerList.entrySet())
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
	

}
