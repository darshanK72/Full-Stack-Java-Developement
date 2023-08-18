<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sq" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>All City in World</h1>
	<sq:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/world" user="root" password="darshan@123" var="ds"></sq:setDataSource>
	<sq:query dataSource="${ds}" var="rs">select * from city</sq:query>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>CountryCode</th>
			<th>District</th>
			<th>Population</th>
		</tr>
		<c:forEach items="${rs.rows}" var="row">
			<tr>
				<td><c:out value="${row.ID}"></c:out></td>
				<td><c:out value="${row.Name}"></c:out></td>
				<td><c:out value="${row.CountryCode}"></c:out></td>
				<td><c:out value="${row.District}"></c:out></td>
				<td><c:out value="${row.Population}"></c:out></td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>