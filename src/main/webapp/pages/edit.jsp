<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
</head>
<body>

	<div class="container" style="margin-top: 50px">
		<div class="row">
			<div class="col-md-6 col-offset-3">
				<form action="${path}/edit" method="post">
				
					<input type="hidden" name="studentId"
						value='<c:out value="${student.id}"/>' placeholder="Enter Name">
						
					<div class="form-group">
						<input type="text" class="form-control" name="studentName"
							value='<c:out value="${student.studentName}"/>'
							placeholder="Enter Name">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="studentEmail"
							value='<c:out value="${student.studentEmail}"/>'
							placeholder="Enter Email">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="studentAddress"
							value='<c:out value="${student.studentAddress}"/>'
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

