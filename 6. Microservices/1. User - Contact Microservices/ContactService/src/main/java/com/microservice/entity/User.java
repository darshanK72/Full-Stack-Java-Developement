package com.microservice.entity;

import java.util.ArrayList;
import java.util.List;


public class User {
	
	private int userId;
	private String username;
	private String password;
	private String address;
	private List<Contact> contactList = new ArrayList<>();
	
	public User() {
		super();
	}
	
	
	
	public User(int userId, String username, String password, String address) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.address = address;
	}


	public User(int userId, String username, String password, String address, List<Contact> contactList) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.address = address;
		this.contactList = contactList;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Contact> getContactList() {
		return contactList;
	}
	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", address=" + address
				+ ", contactList=" + contactList + "]";
	}
	
	
	

}
