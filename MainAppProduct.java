package com.edu.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainAppProduct {

	public static void main(String[] args) {
		Configuration conn=new Configuration();
		conn.configure("myhibernate.cgf.xml");
		
		conn.addAnnotatedClass(product.class);
		SessionFactory sessionFactory=conn.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		product ps=new product();
		//ps.setProductId(1);
		ps.setProductName("SAMSUNG TV");
		ps.setProductprice(14999f);
		product ps1=new product();
		ps1.setProductName("LENOVO LAPTOP");
		ps1.setProductprice(12999f);
		session.save(ps);
		session.save(ps1);
		transaction.commit();

	}

}
