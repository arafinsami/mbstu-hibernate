package com.mbstu.service;

import java.util.List;

import com.mbstu.dao.StudentDao;
import com.mbstu.entity.Student;

public class StudentService {

	private StudentDao dao;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	public void save(Student student) {
		this.dao.save(student);
	}

	public void update(Student student) {
		this.dao.update(student);
	}

	public Student findById(int id) {
		return this.dao.findById(id);
	}

	public void delete(Student student) {
		this.dao.delete(student);
	}

	public List<Student> getAll() {
		return this.dao.getAll();
	}

}
