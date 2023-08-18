package com.servletTypes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet using Generic Servlet");
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1> This is Sparta <h1>");
		pw.println("<h2> This is Comming From Generic Servlet <h2>");
		
		
	}

}
