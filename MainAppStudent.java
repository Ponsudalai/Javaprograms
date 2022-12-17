package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAppStudent {

	public static void main(String[] args) {
		
		Configuration conn=new Configuration();
		conn.configure("hibernate.cgf.xml");
		
		conn.addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory=conn.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Student ps=new Student();
		ps.setSname("Jack");
		ps.setSfees(30000f);
		session.save(ps);
		transaction.commit();
		

	}

}
