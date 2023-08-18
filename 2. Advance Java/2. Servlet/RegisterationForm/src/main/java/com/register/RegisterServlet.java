package com.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_db","root","darshan@123");
				
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String emailid = request.getParameter("emailid");
			String phone = request.getParameter("phone");
			String dob = request.getParameter("dob");
			String gender = request.getParameter("gender");
			
			PreparedStatement stmt = con.prepareStatement("insert into employee(fname,lname,emailid,phone,dob,gender) values(?,?,?,?,?);");
			
			stmt.setString(1,fname);
			stmt.setString(2,lname);
			stmt.setString(3,emailid);
			stmt.setString(4,phone);
			stmt.setString(5,dob);
			stmt.setString(6,gender);
			
			stmt.executeUpdate();
			
			System.out.println("Executed Successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
		
		
		
//		response.setContentType("text/html");
//		PrintWriter pw = response.getWriter();
//		pw.println("<h1> First Name : " + fname + "</h1>");
//		pw.println("<h1> Last Name : " + lname + "</h1>");
//		pw.println("<h1> Email ID : " + emailid + "</h1>");
//		pw.println("<h1> Phone No : " + phone + "</h1>");
//		pw.println("<h1> Date of Birth : " + dob + "</h1>");
//		pw.println("<h1> Gender : " + gender + "</h1>");
//		
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		rd.forward(request, response);
		
		
		
	}

}
