package com.sumproduct;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		Integer num1 = Integer.parseInt(request.getParameter("num1"));
		Integer num2 = Integer.parseInt(request.getParameter("num2"));
		
		Integer prod = num1 * num2;
		
		request.setAttribute("prod", prod);
		
		Integer sum = (int)request.getAttribute("sum");
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1> Sum : " + sum + " </h1>");
		pw.println("<h1> Product : " + prod + " </h1>");
		
		
	}

}
