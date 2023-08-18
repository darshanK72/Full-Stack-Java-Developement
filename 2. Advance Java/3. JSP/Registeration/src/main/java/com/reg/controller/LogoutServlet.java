package com.reg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet{
		
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		HttpSession session = request.getSession();
		
		session.removeAttribute("user");
		
		session.setAttribute("logout-message","Logout Successfully!!!");
		
		response.sendRedirect("login.jsp");
	}

}
