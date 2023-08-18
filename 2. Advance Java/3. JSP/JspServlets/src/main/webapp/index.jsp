<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="error.jsp" %>
<%@ page import="java.util.Random" %>
<%@ taglib uri="/WEB-INF/mytag.tld" prefix="t" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP & Servlet</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h1> <% out.println("Hello World"); %>Hello World!</h1>
	<%! int x = 20; %>
	<% out.println(x);
		Random rd = new Random();
		int y = rd.nextInt(1001);
	%>
	<br>
	<h1> Random Integer</h1> <br>
	<%= y %>
	
	<%
		int a = 23;
		int b = 42;
		
		out.println(a/b);
	%>
	<t:mytag number="18"></t:mytag>
	<a href="taglibr.jsp">taglibrary</a>
	
</body>
</html>