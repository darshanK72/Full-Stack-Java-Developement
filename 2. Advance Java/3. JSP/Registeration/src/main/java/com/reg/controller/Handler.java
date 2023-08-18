package com.reg.controller;

import java.sql.Connection;

import com.reg.dao.DbConnection;

public class Handler {
	
	public static void main(String args[])
	{
		Connection con = DbConnection.getConnection();
		
		System.out.println("Connected!!");
		System.out.println(con);
	}

}
