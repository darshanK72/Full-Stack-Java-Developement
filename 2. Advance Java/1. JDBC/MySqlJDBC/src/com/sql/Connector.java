package com.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	public static void main(String args[]) throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","darshan@123");
		
		Statement st = con.createStatement();
				
		String str = "INSERT INTO PERSONS VALUES(2,'Khairnar','Abhishek','Talegaon Nagar','Pune')";
		String str1 = "INSERT INTO PERSONS VALUES(3,'Khairnar','Prasad','Pandit Colony','Nashik')";
		String str2 = "INSERT INTO PERSONS VALUES(4,'Khairnar','Aakash','Joyti Nagar','Malegaon')";
		String str3 = "INSERT INTO PERSONS VALUES(5,'Khairnar','Krushna','Hinjewadi','Pune')";
		st.execute(str);
		st.execute(str1);
		st.execute(str2);
		st.execute(str3);
		con.close();
		
		System.out.println("Insert Query Executed Successfully!!!");
		
		
		
	}

}
