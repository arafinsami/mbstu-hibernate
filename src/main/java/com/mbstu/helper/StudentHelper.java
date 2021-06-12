package com.mbstu.helper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mbstu.dto.StudentDto;
import com.mbstu.entity.Student;

public class StudentHelper {

	public Student getData(HttpServletRequest request, HttpServletResponse response) {
		StudentDto dto = new StudentDto();
		String studentName = request.getParameter("studentName");
		String studentEmail = request.getParameter("studentEmail");
		String studentAddress = request.getParameter("studentAddress");
		Student student = dto.create(studentName, studentEmail, studentAddress);
		return student;
	}

	public Student update(HttpServletRequest request, HttpServletResponse response) {
		int studentId = Integer.parseInt(request.getParameter("studentId"));
		String studentName = request.getParameter("studentName");
		String studentEmail = request.getParameter("studentEmail");
		String studentAddress = request.getParameter("studentAddress");
		Student student = new Student(studentId, studentName, studentEmail, studentAddress);
		return student;
	}
}
