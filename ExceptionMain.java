package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee{
	String name;
	int age;
	float salary;
	

public void InputData() throws IOException {
	BufferedReader ps=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter The Name:");
	name=ps.readLine();
	System.out.println("Enter your Age ");
	age=Integer.parseInt(ps.readLine());
	System.out.println("Enter Your Salary");
	salary=Float.parseFloat(ps.readLine());
}
public void DisplayData() {
	System.out.println("Empolyee Details");
	System.out.println("Empolyee Name: "+name);
	System.out.println("Empolyee Age: "+age);
	System.out.println("Employee Salary: "+salary);
}
}
public class ExceptionMain {

	public static void main(String[] args) throws IOException {
		Employee np=new Employee();
		np.InputData();
		np.DisplayData();

	}

}
