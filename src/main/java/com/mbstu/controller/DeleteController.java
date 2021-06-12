package com.mbstu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mbstu.entity.Student;
import com.mbstu.service.StudentService;
import com.mbstu.serviceimpl.StudentServiceImpl;

@WebServlet("/delete")
public class DeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private StudentService service;

	public DeleteController() {
		super();
	}

	public void init() {
		this.service = new StudentServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int studentId = Integer.parseInt(request.getParameter("studentId"));
		Student student = this.service.findById(studentId);
		this.service.delete(student);
		response.sendRedirect("/");
	}

}
