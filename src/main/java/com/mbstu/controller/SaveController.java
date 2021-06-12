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
import com.mbstu.serviceimpl.StudentServiceImpl;

@WebServlet("/save")
public class SaveController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private StudentService service;
	
	private StudentHelper helper;

	public SaveController() {
		super();
	}

	public void init() {
		this.service = new StudentServiceImpl();
		this.helper = new StudentHelper();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("pages/create.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Student student = this.helper.getData(request, response);
		this.service.save(student);
		response.sendRedirect("/");
	}

}
