<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.reg.entity.*" %>

<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	<meta charset="ISO-8859-1">
	<style>
	.col-4{
		border:2px solid gray;
		border-radius:15px;
	}
	</style>
<title>Sign Up</title>
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
	<div class="container-fluid mt-5">
		<div class="row justify-content-center">
			<div class="col-4 p-5">
			<h3 class="text-center">Sign Up</h3>
			
			<%
				String reg_message = (String)session.getAttribute("reg-message");
				if(reg_message != null && reg_message.equals("Some Error Occured !! Try Again !"))
				{
			%>
			<div class="alert alert-danger" role="alert">
				<%= reg_message %>
			</div>
			<%
				}
				else if(reg_message != null && reg_message.equals("User Registered Successfully!!!"))
				{
			%>
			<div class="alert alert-success" role="alert">
  				<%= reg_message %> <a href="login.jsp">Click Here to login</a>
			</div>
			<%
				}
				session.removeAttribute("reg-message");
			%>
<form action="signup" method="post">
  <div class="mb-3">
    <label for="fname" class="form-label">First Name</label>
    <input type="text" class="form-control" name="fname" required>
  </div>
  <div class="mb-3">
    <label for="lname" class="form-label">First Name</label>
    <input type="text" class="form-control" name="lname" required>
  </div>		
  <div class="mb-3">
    <label for="email" class="form-label">Email address</label>
    <input type="email" class="form-control" name="email" aria-describedby="emailHelp" required>
  </div>
  <div class="mb-3">
    <label for="pass" class="form-label">Password</label>
    <input type="password" class="form-control" name="pass" required>
  </div>
  <div class="mb-3">
    <label for="phone" class="form-label">Phone No</label>
    <input type="text" class="form-control" name="phone" required>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
			</div>
		</div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.6.3.js" integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM=" crossorigin="anonymous"></script>
	
	<script>
		$(document).ready(function(){
			console.log("page is working")
		})
	</script>
</body>
</html>