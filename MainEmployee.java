package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
		 
		Employee eob=(Employee) ctx.getBean("emp");
		System.out.println(eob);
		eob.display();
	}

}
