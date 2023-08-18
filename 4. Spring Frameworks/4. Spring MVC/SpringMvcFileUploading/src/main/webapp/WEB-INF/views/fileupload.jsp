<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-6 mt-4">
				<form action="filesuccess" method="POST" enctype="multipart/form-data">
					<label for="profile" class="form-label">Profile Image</label>
					<input type="file" class="form-control" name="profile"/>
					<button class="btn btn-primary mt-3" type="submit">Upload</button>
				</form>
			</div>
		</div>
	</div>

<!-- Latest compiled JavaScript -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>