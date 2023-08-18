package com.sumproduct;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SumServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		Integer num1 = Integer.parseInt(request.getParameter("num1"));
		Integer num2 = Integer.parseInt(request.getParameter("num2"));
		
		Integer sum = num1 + num2;
		
		request.setAttribute("sum", sum);
		
		RequestDispatcher rd = request.getRequestDispatcher("prod");
		rd.forward(request, response);
		
	}

}
