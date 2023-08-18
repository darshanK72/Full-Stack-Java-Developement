package com.reg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.reg.dao.DbConnection;
import com.reg.dao.UserDao;
import com.reg.entity.User;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		UserDao userDao = new UserDao(DbConnection.getConnection());
		
		User u = userDao.getUser(email, pass);
		HttpSession session = request.getSession();
		if(u == null)
		{
			session.setAttribute("log-fail-message","Invalid Credentials!!! Please Try with correct Email ID and Password");
			response.sendRedirect("login.jsp");
		}
		else
		{
			session.setAttribute("user", u);
			session.setAttribute("log-success-message", "Login Successfully!!");
			response.sendRedirect("home.jsp");
		}
	}
}
