package com.spring.mvc.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	private String firstName;
	
	private String lastName;
	
	private Date dob;
	
	private String gender;
	
	private String email;
	
	private String password;
	
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="addressId")
	private Address address;
	
	
	public User() {
		super();
	}

	
	public User(int userId, String firstName, String lastName, Date dob, String gender, String email, String password,
			Address address) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	public Address getAddress() {
	return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}


	public Date getDob() {
		return dob;
	}

	public void setDob(String dob) throws ParseException {
		SimpleDateFormat formater = new SimpleDateFormat("dd-mm-yyyy");
		this.dob = formater.parse(dob);
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", email=" + email + ", password=" + password + "]";
	}

	

}
