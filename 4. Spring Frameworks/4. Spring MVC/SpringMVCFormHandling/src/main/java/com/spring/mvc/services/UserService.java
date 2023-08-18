package com.spring.mvc.services;

import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.models.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	
	public void createUser(User user) throws ParseException
	{
		this.userDao.save(user);
		
	}

}
