<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="mes" value="hello"></c:set>
	<c:out value="${mes}"></c:out>
	
	<c:if test="${3 < 4}">
		<h1>Conditional Statement</h1>
	</c:if>
</body>
</html>