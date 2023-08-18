package com.reg.entity;

public class User {
	private int user_id;
	private String fname;
	private String lname;
	private String email;
	private String pass;
	private String phone;
	
	
	public User() {
		super();
	}

	public User(int user_id, String fname, String lname, String email, String pass, String phone) {
		super();
		this.user_id = user_id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.phone = phone;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
