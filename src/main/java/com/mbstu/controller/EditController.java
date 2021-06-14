package com.mbstu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mbstu.entity.Student;
import com.mbstu.helper.StudentHelper;
import com.mbstu.service.StudentService;
import com.mbstu.utils.ApplicationBeans;

@WebServlet("/edit")
public class EditController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private StudentService service;

	private StudentHelper helper;

	public EditController() {
		super();
	}

	public void init() {
		this.service = (StudentService) ApplicationBeans.getBeans("service");
		this.helper = (StudentHelper) ApplicationBeans.getBeans("helper");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int studentId = Integer.parseInt(request.getParameter("studentId"));
		Student student = this.service.findById(studentId);
		request.setAttribute("student", student);
		RequestDispatcher dispatcher = request.getRequestDispatcher("pages/edit.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Student student = this.helper.update(request, response);
		this.service.update(student);
		response.sendRedirect("/");
	}

}
