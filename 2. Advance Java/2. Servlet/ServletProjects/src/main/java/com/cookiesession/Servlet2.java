package com.cookiesession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fname = "";
		String lname = "";
		Cookie cookies[] = req.getCookies();
		
		if(cookies == null)
		{
			System.out.println("No Cookies");
		}
		else
		{
			for(Cookie c : cookies)
			{
				if("fname".equals(c.getName()))
				{
					fname = c.getValue();
				}
				else if("lname".equals(c.getName()))
				{
					lname = c.getValue();
				}
			}
		}
		
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<h1> First Name : " + fname + "</h1>");
		pw.println("<h1> Last Name : " + lname + "</h1>");
	}

}
