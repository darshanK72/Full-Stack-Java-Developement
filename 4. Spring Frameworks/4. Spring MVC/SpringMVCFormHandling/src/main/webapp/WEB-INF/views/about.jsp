<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
</head>
<body>
	<img src="<c:url value="/resources/images/miki.png"/>"></img>
	<h2>First Name : ${user.firstName}</h2>
	<h2>Last Name : ${user.lastName}</h2>
	<h2> Date of Birth : ${user.dob}</h2>
	<h2>Email ID : ${user.email}</h2>
	<h2>Password : ${user.password}</h2>
	<h2>Address </h2> 
	<h3>Street : ${user.address.street}</h3>
	<h3>City : ${user.address.city}</h3>
	<h3>State : ${user.address.state}</h3>
	<h3>Pincode : ${user.address.pincode}</h3>
</body>
</html>