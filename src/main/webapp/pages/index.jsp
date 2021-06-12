<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<div class="row">
			<a href="${path}/save" class="btn btn-primary">Insert Student</a>
			<table class="table">
				<thead>
					<tr>
						<th>Id</th>
						<th>name</th>
						<th>Email</th>
						<th>Address</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="student" items="${responses}">

						<tr>
							<td>${student.studentId}</td>
							<td>${student.studentName}</td>
							<td>${student.studentEmail}</td>
							<td>${student.studentAddress}</td>
							<td><a href="${path}/edit?studentId=<c:out value='${student.studentId}'/>">Edit</a>&nbsp;
								<a href="${path}/delete?studentId=<c:out value='${student.studentId}'/>">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>


