package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Context.xml");
		Student sob=(Student) ctx.getBean("studentobj");
		sob.display();

	}

}
