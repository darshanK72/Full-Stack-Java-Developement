<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is Sparta</h1>
	
	<c:set var="x" value="23" scope="application"></c:set>
	<c:out value="${x}"></c:out>
	<c:if test="${x < 50 }">
		<h1>value of x is less than 50</h1>
	</c:if>
	
	<c:choose>
		<c:when test="${x < 20 }">
			<h1>x is less than 20</h1>
		</c:when>
		<c:when test="${x == 20 }">
			<h1>x is equal to 20</h1>
		</c:when>
		<c:when test="${x > 20 }">
			<h1>x is greater than 20</h1>
		</c:when>
		<c:when test="${x !=20 }">
			<h1>x is not equal 20</h1>
		</c:when>
		<c:otherwise>
			<h1>Nothing</h1>
		</c:otherwise>
	</c:choose>
	
	<c:forEach var="i" begin="1" end="100">
		<p> <c:out value="${i}"></c:out></p>
	</c:forEach>
	
	<c:url var="myurl" value="https://www.google.com/search">
		<c:param name="q" value="codewithharray"></c:param>
	</c:url>
		
	<c:set var="name" value="Darshan Khairnar"></c:set>
	<h1><c:out value="${fn:toUpperCase(name)}"></c:out></h1>
	
	<a href="data.jsp">Database Programming SQL JSTL</a>
	
</body>
</html>