package com.microservice.service;

import java.util.List;

import com.microservice.entity.User;

public interface UserService {
	
	public User getUser(int userId);
	public List<User> getAllUser();
	

}
