package com.springboot.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public UserDao()
	{
		
	}
	
	public String createTable()
	{
		String query = "CREATE TABLE USER(userId int, firstName varchar(20),lastName varchar(20));";
		
		this.jdbcTemplate.execute(query);
		
		return "table created Successfully";
	}
	
	public String insert(int id,String firstName,String lastName)
	{
		String query = "INSERT INTO USER(userId,firstName,lastName) VALUES(?,?,?);";
		this.jdbcTemplate.update(query,new Object[]{id,firstName,lastName});
		
		return "inserted into table successfully";
	}
}
