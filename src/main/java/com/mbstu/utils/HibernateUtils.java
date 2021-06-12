package com.mbstu.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mbstu.entity.Student;

public class HibernateUtils {

	private static SessionFactory sessionFactory = null;

	static {
		try {
			loadSessionFactory();
		} catch (Exception e) {
			System.err.println("Exception while initializing hibernate util.. ");
			e.printStackTrace();
		}
	}

	public static void loadSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("/hibernate.cfg.xml");
		configuration.addAnnotatedClass(Student.class);
		ServiceRegistry srvcReg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
				.build();
		sessionFactory = configuration.buildSessionFactory(srvcReg);
	}

	public static Session getSession() throws HibernateException {
		Session session = null;
		try {
			session = sessionFactory.openSession();
		} catch (Throwable t) {
			System.err.println("Exception while getting session.. ");
			t.printStackTrace();
		}
		if (session == null) {
			System.err.println("session is discovered null");
		}
		return session;
	}
}
