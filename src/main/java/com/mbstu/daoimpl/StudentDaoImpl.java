package com.mbstu.daoimpl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mbstu.dao.StudentDao;
import com.mbstu.entity.Student;
import com.mbstu.utils.HibernateUtils;

public class StudentDaoImpl implements StudentDao {

	@Override
	@Transactional
	public void save(Student student) {
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
	}

	@Override
	@Transactional
	public void update(Student student) {
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(student);
		transaction.commit();
	}

	@Override
	public Student findById(int id) {
		Session session = HibernateUtils.getSession();
		Student student = session.get(Student.class, id);
		return student;
	}

	@Override
	@Transactional
	public void delete(Student student) {
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		student = session.get(Student.class, student.getId());
		session.delete(student);
		transaction.commit();
	}

	@Override
	public List<Student> getAll() {
		Session session = HibernateUtils.getSession();
		TypedQuery<Student> userListQuery = session.createQuery("FROM Student");
		List<Student> students = userListQuery.getResultList();
		return students;
	}

}
