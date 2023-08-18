<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Success Page</title>
</head>
<body>
	<h1>File Uploaded Successfully !!</h1>
	<h2>${fileName}</h2>
	<img src="<c:url value="/resources/images/${fileName}"/>" />
</body>
</html>