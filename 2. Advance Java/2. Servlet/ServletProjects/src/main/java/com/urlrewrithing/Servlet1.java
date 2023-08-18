package com.urlrewrithing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<h1> First Name : " + fname + "</h1>");
		pw.println("<h1> Last Name : " + lname + "</h1>");
		pw.println("<a href='url2?fname=" + fname + "&lname=" + lname + "'> Redirect </a>");
	}

}
