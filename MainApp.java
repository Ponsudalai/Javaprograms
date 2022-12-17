package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		Configuration conn=new Configuration();
		conn.configure("myhibernate.cgf.xml");
		
		conn.addAnnotatedClass(Employee.class);
		conn.addAnnotatedClass(Address.class);
		
		SessionFactory sessionFactory=conn.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Address aob=new Address();
		aob.setAddreesCity("Chennai");
		aob.setAddressStreet("Periyar St");
		
		Employee eob=new Employee();
		eob.setEmployeeemail("admin123@gmail.com");
		eob.setEmployeename("admin");
		eob.setAddress(aob);
		
		session.save(eob);
		transaction.commit();
		session.close();
	}

}
