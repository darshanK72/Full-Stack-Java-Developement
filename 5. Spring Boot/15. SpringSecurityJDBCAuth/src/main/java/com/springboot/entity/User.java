package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userid")
    private int userId;

    private String username;
    private String password;
    private String role;
    private boolean enabled;

    public User() {
    }

    public User(int userId, String username, String password, String role, boolean enabled) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.role = role;
		this.enabled = enabled;
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

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + username + ", password=" + password + "]";
    }




    
    
}
