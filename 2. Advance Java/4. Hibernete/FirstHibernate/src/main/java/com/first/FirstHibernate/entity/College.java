package com.first.FirstHibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class College {
	
	@Id
	int college_id;
	
	String college_name;
	int capacity;
	String address;
	String university;
	
	public College(int college_id, String college_name, int capacity, String address, String university) {
		super();
		this.college_id = college_id;
		this.college_name = college_name;
		this.capacity = capacity;
		this.address = address;
		this.university = university;
	}

	public College() {
		super();
	}

	public int getCollege_id() {
		return college_id;
	}

	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
	
	
}
