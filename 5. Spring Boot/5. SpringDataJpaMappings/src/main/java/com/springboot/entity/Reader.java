package com.springboot.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Reader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int readerId;
	private String firstName;
	private String lastName;
	
	@OneToOne(mappedBy = "reader",cascade = CascadeType.ALL)
	@JsonManagedReference
	private Address address;
	
	@OneToMany(mappedBy = "reader",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Certificate> certificates = new ArrayList<>();
	
	
	@ManyToMany(mappedBy = "readers",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Book> books = new ArrayList<>();
	
	public Reader() {
		super();
	}

	
	public Reader(int readerId, String firstName, String lastName, Address address, List<Certificate> certificates,
			List<Book> books) {
		super();
		this.readerId = readerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.certificates = certificates;
		this.books = books;
	}


	public Reader(int readerId, String firstName, String lastName, Address address, List<Certificate> certificates) {
		super();
		this.readerId = readerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.certificates = certificates;
	}

	public Reader(int readerId, String firstName, String lastName, Address address) {
		super();
		this.readerId = readerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public int getReaderId() {
		return readerId;
	}

	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}
	
	

	public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}


	@Override
	public String toString() {
		return "Reader [readerId=" + readerId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", certificates=" + certificates + "]";
	}

	
	
	

}
