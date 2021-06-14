package com.mbstu.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mbstu.entity.Student;
import com.mbstu.utils.HibernateUtils;

public class StudentDao {

	@Transactional
	public void save(Student student) {
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
	}

	@Transactional
	public void update(Student student) {
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(student);
		transaction.commit();
	}

	public Student findById(int id) {
		Session session = HibernateUtils.getSession();
		Student student = session.get(Student.class, id);
		return student;
	}

	@Transactional
	public void delete(Student student) {
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		student = session.get(Student.class, student.getId());
		session.delete(student);
		transaction.commit();
	}

	public List<Student> getAll() {
		Session session = HibernateUtils.getSession();
		TypedQuery<Student> userListQuery = session.createQuery("FROM Student");
		List<Student> students = userListQuery.getResultList();
		return students;
	}

}
