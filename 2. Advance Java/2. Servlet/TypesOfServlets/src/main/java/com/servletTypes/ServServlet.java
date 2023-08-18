package com.servletTypes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServServlet implements Servlet{

	@Override
	public void destroy() {
		System.out.println("Destroying Servlet");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Creating Servlet");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet Using Servlet");
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		pw.println("<h1> This is Sparta <h1>");
		pw.println("<h2> This is Comming form Servlet implemented using Servlet <h2>");
		
	}

}
