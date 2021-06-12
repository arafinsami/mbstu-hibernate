package com.mbstu.response;

import com.mbstu.entity.Student;

import lombok.Data;

@Data
public class StudentResponse {

	private int studentId;

	private String studentName;

	private String studentEmail;

	private String studentAddress;

	public static StudentResponse from(Student student) {
		StudentResponse res = new StudentResponse();
		res.setStudentId(student.getId());
		res.setStudentName(student.getStudentName());
		res.setStudentEmail(student.getStudentEmail());
		res.setStudentAddress(student.getStudentAddress());
		return res;
	}
}
