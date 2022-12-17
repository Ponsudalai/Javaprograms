package com.edu;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentsMain {

	public static void main(String[] args) {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		con.addAnnotatedClass(Students.class);
		
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Students vj=new Students();
		vj.setStudentname("Jack");
		
		s.save(vj);
		Students vj1=new Students();
		vj1.setStudentname("Jack");
		
		s.save(vj1);
		t.commit();
		
       TypedQuery query=s.getNamedQuery("findStudentName");
       query.setParameter("n", "Jack");
       
       List<Students>vjquery=query.getResultList();
		Iterator<Students>it=vjquery.iterator();
		System.out.println("ID\tNAME");
		
		while(it.hasNext()) {
			Students s1=it.next();
			System.out.println(s1.getStudentid()+"\t"+s1.getStudentname());
		}
	}

}
