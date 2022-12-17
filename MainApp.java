package com.edu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = {"com.edu"})
public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MainApp.class);
		ServiceInterface np=(ServiceInterface) ctx.getBean("serviceClass");
		np.Reverse(" PONSUDALAI");
	}

}
