package com.edu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentMain {
	
	public static void main(String[] args) {
		
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		    EntityManager em=emf.createEntityManager();
		   
		      em.getTransaction().begin();
		      StudentJPA s1=new StudentJPA();
		      s1.setStudentid(1113);
		      s1.setStudentname("Gibbs");
		      s1.setStudentfees(25000.99f);
		       em.persist(s1);
		       em.getTransaction().commit();
		       System.out.println("Record is saved");
		       StudentJPA s2;
			      s2=em.find(StudentJPA.class, 1113);
			      System.out.println(s2);
	}

}
