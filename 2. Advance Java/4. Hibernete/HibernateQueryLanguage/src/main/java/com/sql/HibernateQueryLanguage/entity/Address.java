package com.sql.HibernateQueryLanguage.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	public String city;
	public String state;
	public int pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
	
}
