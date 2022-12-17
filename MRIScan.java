package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MRIScan {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
		Human hob=(Human) ctx.getBean("Lungs");
		hob.heartfunction();
	}

}
