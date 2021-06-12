package com.mbstu.service;

import java.util.List;

import com.mbstu.entity.Student;

public interface StudentService {

	public void save(Student student);

	public void update(Student student);

	public Student findById(int id);

	public void delete(Student student);

	public List<Student> getAll();
}
