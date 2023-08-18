package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Results {

	public static void main(String[] args) throws SQLException{
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","darshan@123");
		
		Statement st = con.createStatement();
		
		String s = "SELECT * FROM PERSONS";
		
		ResultSet res = st.executeQuery(s);
		
		while(res.next())
		{
			int person_id = res.getInt("PersonID");
			String lastName = res.getString("LastName");
			String firstName = res.getString("LastName");
			String address = res.getString("Address");
			String city = res.getString("City");
			
			System.out.println(person_id + " " + lastName + " " + firstName + " " + address + " " + city);
		}
		con.close();
		
		System.out.println("Select Query Executed Successfully!!!");
	}

}
