package com.reg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.reg.dao.DbConnection;
import com.reg.dao.UserDao;
import com.reg.entity.User;

public class ControllerServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		boolean f = false;
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String phone = request.getParameter("phone");
		
		
		User user = new User();
		user.setFname(fname);
		user.setLname(lname);
		user.setEmail(email);
		user.setPass(pass);
		user.setPhone(phone);
		
		UserDao userDao = new UserDao(DbConnection.getConnection());
		
		try {
			f = userDao.registerUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		if(f == true)
		{
			
			session.setAttribute("reg-message", "User Registered Successfully!!!");
			response.sendRedirect("signup.jsp");
		}
		else
		{
			session.setAttribute("reg-message", "Some Error Occured !! Try Again !");
			response.sendRedirect("signup.jsp");
		}
		
		
	}

}
