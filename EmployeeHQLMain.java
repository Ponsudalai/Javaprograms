package com.edu;

import java.util.Scanner;

import org.hibernate.SessionFactory;

public class EmployeeHQLMain {

	public static void main(String[] args) {
		
		HibernateUtil hob=new HibernateUtil();
		SessionFactory sf=hob.getSessionFactory();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice");
		System.out.println("1. to Add Employee");
		System.out.println("2. get Employee");
		System.out.println("3. get employees by id");
		System.out.println("4. update employee name ");
		System.out.println("5. delete employee byid");
		int ch=sc.nextInt();
		
		switch(ch) {
		
		case 1:HibernateOperations.addemployee(sf);
		break;
		case 2:HibernateOperations.getallemployees(sf);
		break;
		case 3:HibernateOperations.getemployeebyid(sf);
		break;
		case 4:HibernateOperations.updateemployee(sf);
		break;
		case 5:HibernateOperations.deleteemployee(sf);
		break;
		
		default:
			System.out.println("Invalid Option");
			System.out.println("program Is Terminated");
			System.exit(0);
		}

	}

}
