package com.mbstu.serviceimpl;

import java.util.List;

import com.mbstu.dao.StudentDao;
import com.mbstu.daoimpl.StudentDaoImpl;
import com.mbstu.entity.Student;
import com.mbstu.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao = new StudentDaoImpl();

	@Override
	public void save(Student student) {
		this.dao.save(student);
	}

	@Override
	public void update(Student student) {
		this.dao.update(student);
	}

	@Override
	public Student findById(int id) {
		return this.dao.findById(id);
	}

	@Override
	public void delete(Student student) {
		this.dao.delete(student);
	}

	@Override
	public List<Student> getAll() {
		return this.dao.getAll();
	}

}
