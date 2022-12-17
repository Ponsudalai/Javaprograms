package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Context.xml.");
		LifeCycle sp=(LifeCycle) context.getBean("lifecycle");
		        System.out.println("Message from xml file "+sp.getMesg());
		        ((AbstractApplicationContext) context).registerShutdownHook(); //destroy
		}
	}

