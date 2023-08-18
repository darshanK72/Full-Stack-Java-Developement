<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<title>Registration Page</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row justify-content-center">
			<h3 class="col-6 text-center mt-5">This is Registration Page</h3>
		</div>
		<div class="row justify-content-center">
			<div class="col-4 alert alert-danger" role="alert">
 				<form:errors path="user.*"/>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-4">
				<form action="about" method="POST">
				  <div class="mb-3">
				    <label for="firstName" class="form-label">First Name :</label>
				    <input type="text" class="form-control" id="fname" placeholder="Enter First Name" name="firstName">
				  </div>
				  <div class="mb-3 mt-3">
				    <label for="lastName" class="form-label">Last Name :</label>
				    <input type="text" class="form-control" id="lname" placeholder="Enter Last Name" name="lastName">
				  </div>
				  <div class="mb-3 mt-3">
				    <label for="dob" class="form-label">Date of Birth :</label>
				    <input type="date" class="form-control" id="dob" placeholder="dd-mm-yyyy" name="dob">
				  </div>
				  <div class="mb-3 mt-3">
				  	<h5 class="text-center">Address</h5>
				  	<label for="address.street">Street</label>
				  	<input type="text" class="form-control" name="address.street"> 
				  	<label for="address.city">City</label>
				  	<input type="text" class="form-control" name="address.city"> 
				  	<label for="address.state">State</label>
				  	<input type="text" class="form-control" name="address.state"> 
				  	<label for="address.pincode">Pin Code</label>
				  	<input type="text" class="form-control" name="address.pincode"> 
				  </div>
				  <div class="mb-3 mt-3">
				  	 <label for="gender" class="form-label">Gender : </label>
				  	 <input type="radio" name="gender" class="form-radio" value="Male" > Male
				  	 <input type="radio" name="gender" class="form-radio" value="Female"> Female
				  </div>
				  <div class="mb-3 mt-3">
				    <label for="email" class="form-label">Email :</label>
				    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
				  </div>
				  <div class="mb-3">
				    <label for="password" class="form-label">Password:</label>
				    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
				  </div>
				  <div class="text-center">
				  	<button type="submit" class="btn btn-primary">Submit</button>
				  </div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>