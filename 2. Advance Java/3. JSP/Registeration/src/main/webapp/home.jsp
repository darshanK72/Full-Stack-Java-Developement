<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.reg.dao.*,java.sql.*,com.reg.entity.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% 
	User u = (User)session.getAttribute("user");
	if(u == null)
	{
		response.sendRedirect("login.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="home.jsp">Registeration Application</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="home.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Login</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="signup.jsp">Sign Up</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
			<%
				String log_message = (String)session.getAttribute("log-success-message");
				if(log_message != null)
				{
			%>
			<div class="alert alert-success" role="alert">
				<%= log_message %>
			</div>
			
			<%
				}
				session.removeAttribute("log-success-message");
				if(u != null)
				{
			%>
				<div class="container-fluid">
				<div class="row justify-content-center mt-5">
					<div class="col-4 p-3"  style="border:2px solid black;">
						<p>
							Name : <%= u.getFname() + u.getLname() %> <br>
							Email Id : <%= u.getEmail() %> <br>
							Phone : <%= u.getPhone() %> <br>
							
						</p>
						<a class="btn btn-primary" href="logout">Logout</a>
					</div>
				</div>
			</div>
			<%
				}	
			%>
			
			
			
</body>
</html>