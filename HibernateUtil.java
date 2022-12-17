package com.edu;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public SessionFactory getSessionFactory() {
		Configuration config=new Configuration();
		
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(EmployeeHQL.class);
		
		SessionFactory sf=config.buildSessionFactory();
		
		return sf;
	}

}
