package com.mbstu.controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mbstu.entity.Student;
import com.mbstu.response.StudentResponse;
import com.mbstu.service.StudentService;
import com.mbstu.utils.ApplicationBeans;

@WebServlet("/")
public class IndexController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private StudentService service;

	public IndexController() {
		super();
	}

	public void init() {
		this.service = (StudentService) ApplicationBeans.getBeans("service");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Student> students = service.getAll();
		Set<StudentResponse> responses = students.stream().map(StudentResponse::from).collect(Collectors.toSet());
		request.setAttribute("responses", responses);
		RequestDispatcher dispatcher = request.getRequestDispatcher("pages/index.jsp");
		dispatcher.forward(request, response);
	}

}
