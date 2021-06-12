package com.mbstu.dto;

import com.mbstu.entity.Student;

import lombok.Data;

@Data
public class StudentDto {

	private String studentName;

	private String studentEmail;

	private String studentAddress;

	public Student create(String studentName, String studentEmail, String studentAddress) {
		Student student = new Student();
		student.setStudentName(studentName);
		student.setStudentEmail(studentEmail);
		student.setStudentAddress(studentAddress);
		return student;
	}
}
