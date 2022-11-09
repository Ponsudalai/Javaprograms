package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

class Empolyee{
	
	int eid;
	String ename;
	float esalary;
	String edept;
	public Empolyee(int eid, String ename, float esalary, String edept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.edept = edept;
	}
	@Override
	public String toString() {
		return "Empolyee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", edept=" + edept + "]";
	}
	
	
}

public class MainAppEmpolyee {

	public static void main(String[] args) {
		ArrayList<Empolyee>e=new ArrayList<Empolyee>();
		Empolyee s1=new Empolyee(17,"Jack",25000.98f,"Software Testing");
		Empolyee s2=new Empolyee(25,"Gibbs",20000.99f,"Front End");
		Empolyee s3=new Empolyee(13,"Hendry",23000.99f,"Back End");
		Empolyee s4=new Empolyee(12,"James",24000.99f,"Java Developer");
		
		e.add(s1);
		e.add(s2);
		e.add(s3);
		e.add(s4);
		
		System.out.println(e);
		System.out.println("************************************************");
		
		Iterator<Empolyee>ps=e.iterator();
		System.out.println("EID\tNAME\tSALARY\t        DEPARTMENT");
		while(ps.hasNext()) {
			Empolyee sob=ps.next();
		System.out.println(sob.eid+"\t"+sob.ename+"\t"+sob.esalary+"\t"+sob.edept);
		
		}
		
	}

}
