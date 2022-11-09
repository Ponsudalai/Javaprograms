package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	
	int sid;
	String sname;
	float sfees;
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
	
}

public class MainAppStudent {

	public static void main(String[] args) {
		ArrayList<Student>slist=new ArrayList<Student>();
		Student s1=new Student(01,"Jack",30000.5f);
		Student s2=new Student(02,"Gibbs",20000.5f);
		Student s3=new Student(03,"Narignton",25000.5f);
		Student s4=new Student(04,"Hendry",5000.5f);
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		
		System.out.println(slist);
		System.out.println("******************************");
		
		Iterator<Student>st=slist.iterator();
		System.out.println("SID\tNAME\tFEES");
		while(st.hasNext()) {
			Student sob=st.next();
			System.out.println(sob.sid+"\t"+sob.sname+"     \t"+sob.sfees );
		}
	}

}
