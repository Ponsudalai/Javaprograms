package com.edu;

public class Student {
	private int studentid;
	private String studentname;
	public Student(int studentid, String studentname) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
	}
	
	public void display() {
		System.out.println("Student ID "+studentid);
		System.out.println("Student Name "+studentname);
	}

}
