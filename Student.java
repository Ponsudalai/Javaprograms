package com.edu;

public class Student {
	private static Student student=new Student();
	
	private Student() {
		
	}
	public static Student getStudentobject() {
		return student;
	}
public void studentInfo() {
	System.out.println("SUDALAI");
}
}
