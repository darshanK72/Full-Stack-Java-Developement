package com.sql.HibernateQueryLanguage.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rollno")
	int roll_no;
	
	String name;
	
	Address address;
	
	@OneToOne
	@JoinColumn(name="certificate")
	Certificate certificate;
	
	@ManyToMany(mappedBy="students",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	Set<Subject> subjects; 
	
	

	public Student() {
		super();
	}

	public Student(int roll_no,String name, Address address,Certificate certificate,Set<Subject> subjects) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
		this.certificate = certificate;
		this.subjects = subjects;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
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

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	
	
	

}
