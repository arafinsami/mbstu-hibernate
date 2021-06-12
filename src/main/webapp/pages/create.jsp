<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Student</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
</head>
<body>

	<div class="container" style="margin-top: 50px">
		<div class="row">
			<div class="col-md-6 col-offset-3">
				<form action="${path}/save" method="post">
					<div class="form-group">
						<input type="text" class="form-control" name="studentName"
							placeholder="Enter Name">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="studentEmail"
							placeholder="Enter Email">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="studentAddress"
							placeholder="Enter Addresss">
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

