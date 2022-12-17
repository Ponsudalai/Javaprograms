package com.edu;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HibernateOperations {

	
		

	

	

	public static void getallemployees(SessionFactory sf) {
		try(Session session=sf.openSession()){
			
			System.out.println("Inside getAllEmployees");
			String sel="FROM EmployeeHQL";
			
			Query<EmployeeHQL> q=session.createQuery(sel,EmployeeHQL.class);
			List<EmployeeHQL> list=q.list();
			Iterator<EmployeeHQL>it=list.iterator();
			System.out.println("ID     NAME      Email    DoB     Salary");
			while(it.hasNext()) {
				EmployeeHQL eob=it.next();
				System.out.println(eob.getEmployeeid()+" " +eob.getEmpname()+" "+eob.getMail()+" "+eob.getDoj()+" "+eob.getSalary());
			}
		}
		
	}

	public static void getemployeebyid(SessionFactory sf) {
		
try(Session session=sf.openSession()){
			
			
			String sel="FROM EmployeeHQL where employeeid=:id";
			Query<EmployeeHQL>q=session.createQuery(sel,EmployeeHQL.class);
			q.setParameter("id", 1);
			EmployeeHQL eob=q.uniqueResult();
			System.out.println(eob);
			
			
			
		}
		
	}

		
		
	

	public static void updateemployee(SessionFactory sf) {
		try(Session session=sf.openSession()){
			
			Transaction t=session.beginTransaction();
			Query q=session.createQuery("update EmployeeHQL set e_name=:n where id=:i");  
			q.setParameter("n","Rakesh");  
			q.setParameter("i",1);  
			  
			int status=q.executeUpdate();  
			if(status>1) {
			System.out.println(status +"Record updated");  
			t.commit();  

			}
		}
		
	}

	public static void deleteemployee(SessionFactory sf) {

		try(Session session=sf.openSession()){
			
			Transaction tx=session.beginTransaction();
			Query q=session.createQuery("delete from EmployeeHQL where employee_Id=2");  
			 
			
			int status=q.executeUpdate();  
			if(status>1) {
			System.out.println(status +"Record deleted");  
			tx.commit();  

			}
			
		}
		
	}



	public static void addemployee(SessionFactory sf) {
		
		
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		EmployeeHQL eob=new EmployeeHQL();
		eob.setEmpname("Rameh");
		eob.setDoj(new Date());
		eob.setMail("ramesh@yahoo.com");
		eob.setSalary(6754.00);
		
		EmployeeHQL eob1=new EmployeeHQL();
		eob1.setEmpname("Rajesh");
		eob1.setDoj(new Date());
		eob1.setMail("rajesh@yahoo.com");
		eob1.setSalary(6758.00);
		
		ss.save(eob);
		ss.save(eob1);
		t.commit();
		
	}

	


	



}
