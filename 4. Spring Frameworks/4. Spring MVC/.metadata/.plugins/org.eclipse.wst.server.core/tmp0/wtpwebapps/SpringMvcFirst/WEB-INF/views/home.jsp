<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>This is Home Page</h1>
	<a href="index">Index Page</a>
	<%
		/* String name = (String) request.getAttribute("name");
		Integer age = (Integer) request.getAttribute("age");
		ArrayList<String> friends = (ArrayList<String>) request.getAttribute("friends"); */
	%>
	
	<h1> Name :  ${name}</h1> <br>
	<h1> Age : ${age} </h1>
	
	<c:forEach var="friend" items="${friends}">
		<h1>${friend}</h1> <br>
	</c:forEach>
	
	<%-- <% 
	for(String friend : friends)
	{	
	%>
		
	<%
	}
	%> --%>
</body>
</html>