package com.reg.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static Connection conn = null;
	
	public static Connection getConnection()
	{
		try
		{
		if(conn == null)
		{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_db","root","darshan@123");
				
		}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
			return conn;
	}
	
	public static void main()
	{
		Connection con = getConnection();
	}
}
