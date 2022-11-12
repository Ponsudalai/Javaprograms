package com.edu;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Student{
	
	int Rollno;
	String Name;
	String Dept;
	
}

public class MainAppSerielization {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream vjs=new FileOutputStream("God Of War.txt");
		PrintStream vj=new PrintStream(vjs);
		
		Student np=new Student();
		np.Rollno=17;
		np.Name="JACK SPARROW";
		np.Dept="BCA";
		vj.println(np.Rollno);
		vj.println(np.Name);
		vj.println(np.Dept);
		
		vj.close();
		vjs.close();
		
		System.out.println("Your Data Is Succesfully Added");
		
	}

}
