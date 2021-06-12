package com.mbstu.dao;

import java.util.List;

import com.mbstu.entity.Student;

public interface StudentDao {

	public void save(Student student);

	public void update(Student student);

	public Student findById(int id);

	public void delete(Student student);

	public List<Student> getAll();
}
