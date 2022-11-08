package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionMain {

	public static void main(String[] args) throws IOException {
		String name;
		int age;
		float salary;
		
		BufferedReader ps=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your Name");
		name=ps.readLine();
		System.out.println("Enter your Age ");
		age=Integer.parseInt(ps.readLine());
		System.out.println("Enter Your Salary");
		salary=Float.parseFloat(ps.readLine());
		
		
		// Display Details
		
		System.out.println("Empolyee Details");
		System.out.println("Empolyee Name: "+name);
		System.out.println("Empolyee Age: "+age);
		System.out.println("Employee Salary: "+salary);
	}

}
