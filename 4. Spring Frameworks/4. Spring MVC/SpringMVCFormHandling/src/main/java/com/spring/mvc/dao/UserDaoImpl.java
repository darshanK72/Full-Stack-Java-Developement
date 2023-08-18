package com.spring.mvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.models.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void save(User user) {
		this.hibernateTemplate.save(user);
	}

	public void delete(int userId) {
		
	}

	public void update(User user) {
		
	}

	public User getUser(int userId) {
		return null;
	}

	public List<User> getAllUser() {
		return null;
	}

}
