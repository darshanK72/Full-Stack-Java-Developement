package com.servletTypes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HtpServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("Http Servlet Starting");
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1> This is From HTTP Servlet <h1>");
		
	}
	
}
