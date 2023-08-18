package com.spring.mvc.dao;

import java.util.List;

import com.spring.mvc.models.User;

public interface UserDao {
	
	public void save(User user);
	public void delete(int userId);
	public void update(User user);
	public User getUser(int userId);
	public List<User> getAllUser();

}
