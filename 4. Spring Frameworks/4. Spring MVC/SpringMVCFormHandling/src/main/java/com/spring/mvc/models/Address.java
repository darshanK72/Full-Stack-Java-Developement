package com.spring.mvc.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addressId;
	
	private String city;
	
	private String state;
	
	private int pincode;
	
	private String street;
	
	@OneToOne(mappedBy="address",cascade= {CascadeType.ALL})
	private User user;
	

	public Address(int addressId, String city, String state, int pincode, String street, User user) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.street = street;
		this.user = user;
	}
	public Address() {
		super();
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
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

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	

}
