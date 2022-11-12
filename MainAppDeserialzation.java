package com.edu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Student1{
	int Rollno;
	String Name;
	String Dept;
	@Override
	public String toString() {
		return "Student1 [Rollno=" + Rollno + ", Name=" + Name + ", Dept=" + Dept + "]";
	}

	
	
}

public class MainAppDeserialzation {

	public static void main(String[] args) throws IOException {
		
		FileInputStream vjs=new FileInputStream("God Of War.txt");
		BufferedReader vj=new BufferedReader(new InputStreamReader(vjs));
		
		Student1 s1=new Student1();
		s1.Rollno=Integer.parseInt(vj.readLine());
		s1.Name=vj.readLine();
		s1.Dept=vj.readLine();
		vjs.close();
		vj.close();
		
		System.out.println(s1);
		
		

	}

}
