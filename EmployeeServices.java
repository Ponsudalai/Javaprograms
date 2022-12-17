package com.edu;

import org.springframework.stereotype.Component;

@Component("eob")
public class EmployeeServices {
	public void display() {
		System.out.println("Name: Jack");
		System.out.println("Id: 17");
	}

}
