package com.reg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.reg.entity.User;

public class UserDao {
	
	private Connection conn;

	public UserDao(Connection conn)
	{
		super();
		this.conn = conn;
	}
	
	public boolean registerUser(User u) throws SQLException
	{
		boolean f = false;
		try
		{
			String query = "insert into user(fname,lname,email,pass,phone) values(?,?,?,?,?);";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, u.getFname());
			stmt.setString(2, u.getLname());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPass());
			stmt.setString(5, u.getPhone());
			
			stmt.executeUpdate();
			f = true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
		return f;
	}
	
	public User getUser(String email,String pass)
	{
		User u = null;
		try {
			
			String query = "select * from user where email = ? and pass=?;";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, email);
			stmt.setString(2, pass);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				u = new User(rs.getInt("user_id"),rs.getString("fname"),rs.getString("lname"),rs.getString("email"),rs.getString("pass"),rs.getString("phone"));
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return u;
	}
}
