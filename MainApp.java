package com.edu;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
;

public class MainApp {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		con.addAnnotatedClass(Employee.class);
		
					SessionFactory sessionFactory= con.buildSessionFactory();
		
					Session session=sessionFactory.openSession();
	
				Transaction transaction= session.beginTransaction();
				
				/*Employee ne=new Employee();
				
				//ne.setEmployeeName("gibbs");
				//ne.setEmployeeSalary(19599f);
				//ne.setEmployeeEmail("gibbs@gmail.com");
				//ne.setEmployeePhone(9710173838l);
				
				Employee va=new Employee("Sivaji A",45000f,"sivaji304@gmail.com",1237654987l);
				
				
				session.save(va);
				
				session.delete(va);
				System.out.println("Employee"+va);
				Employee e=session.get(Employee.class,2);
				System.out.println(e);
				//transaction.commit();*/
				
				Query query=session.createQuery("from Employee");
				List<Employee>lit=query.list();
				
				Iterator<Employee> it=lit.iterator();
				
				System.out.println("E_Id\tE_Name\tE_Phone\tE_Email\tE_Salary");
				while(it.hasNext()) {
					Employee e=it.next();
					System.out.println(e.getEmployeeid()+"\t"+e.getEmployeeName()+"\t"+e.getEmployeePhone()+"\t"+e.getEmployeeEmail()+"\t"+e.getEmployeeSalary());
				}
				
	}
	

}
