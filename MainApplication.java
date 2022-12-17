package com.edu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annob=new AnnotationConfigApplicationContext("com.edu");
		EmployeeServices emp=(EmployeeServices) annob.getBean("eob");
		emp.display();
	}

}
