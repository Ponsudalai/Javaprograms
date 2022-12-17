package edu.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AccountEmployee {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("myhibernate.cgf.xml");
		
		configuration.addAnnotatedClass(EmployeeEntity.class);
		configuration.addAnnotatedClass(AccountEntity.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		
		
		AccountEntity accountEntity=new AccountEntity();
		accountEntity.setAccountId(7686876);
		
		session.save(accountEntity);
		
		
		EmployeeEntity employeeEntity=new EmployeeEntity();
		employeeEntity.setEmployeeName("Yash");
		employeeEntity.setEmployeeEmail("kgf1100@gmail.com");
		employeeEntity.setAccount(accountEntity); 
		
		session.save(employeeEntity);
		transaction.commit();
		}

	}


