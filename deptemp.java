package com.edu;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class deptemp {

	public static void main(String[] args) {
		
		Configuration con=new Configuration();
		con.configure("myhibernate.cfg.xml");
		
		con.addAnnotatedClass(Department.class);
		con.addAnnotatedClass(Employee.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();


		Department dept=new Department();
		dept.setDeptname("sales");
		

		Employee emp1=new Employee();
		emp1.setEmployeename("Rana");
		emp1.setEmployeephone(24);

		Employee emp2=new Employee();
		emp2.setEmployeename("Aksan");
		emp2.setEmployeephone(25);


		ArrayList<Employee>emplist=new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp1);

		dept.setEmployees(emplist);

		session.save(dept);
		transaction.commit();
		session.close();




		}
		
	

		
	
	}


