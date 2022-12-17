package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
		TextEditor tob=(TextEditor) ctx.getBean("textEditor");
		tob.textEditorFunction();
	}

}
