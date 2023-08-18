package com.microservice.entity;

public class Contact {
	
	private int contactId;
	private String name;
	private String number;
	private int userId;
	
	public Contact(int contactId, String name, String number, int userId) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.number = number;
		this.userId = userId;
	}

	public Contact() {
		super();
	}
	
	public Contact(int contactId, String name, String number) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.number = number;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", name=" + name + ", number=" + number + "]";
	}
	
	

}
