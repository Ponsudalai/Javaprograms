package com.edu.sortst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
	int eid;
	String ename;
	int eage;
	
	public Employee(int eid, String ename, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + "]";
	}
	
	
}

class SortAge implements Comparator<Employee>{

	@Override
	public int compare(Employee eob1, Employee eob2) {
		if (eob1.eage<eob2.eage) 
			return -1;
			else if(eob1.eage>eob2.eage)
				return 1;
			else
				return 0;
		}
			
			
		
				
	
	}

class Sortid implements Comparator<Employee>{

	@Override
	public int compare(Employee eb1, Employee eb2) {
		if (eb1.eid<eb2.eid) 
			return -1;
			else if(eb1.eid>eb2.eid)
				return 1;
			else
				return 0;
		}
			
			
		
				
	
	}

class Sortname implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.ename.compareTo(o2.ename);
	}
	
}
	


public class MainEmployee {

	public static void main(String[] args) {
	
		ArrayList<Employee>ps=new ArrayList<Employee>();
		
		Employee s1=new Employee(1, "Jack",22);
		Employee s2=new Employee(11, "Gibbs",21);
		Employee s3=new Employee(3, "Hendry",19);
		Employee s4=new Employee(14, "James",25);
		
		ps.add(s1);
		ps.add(s2);
		ps.add(s3);
		ps.add(s4);
		
		System.out.println(ps);
		
		SortAge eage=new SortAge();
		Collections.sort(ps,eage);
		
		System.out.println("After Sorting");
		
		System.out.println(ps);
		
		Sortid eo=new Sortid();
		Collections.sort(ps,eo);
		
		System.out.println("After Sorting");
		
		System.out.println(ps);
		
		
		Iterator<Employee>e=ps.iterator();
		System.out.println("EID\tNAME\tAGE");
		while (e.hasNext()) {
	 Employee npps=e.next();
	 System.out.println(npps.eid+"\t"+npps.ename+"\t"+npps.eage);
		}
		
		Sortname vj=new Sortname();
		Collections.sort(ps,vj);
		
		System.out.println("After Sorting");
		
		System.out.println(ps);
		
	 Iterator<Employee> s=ps.iterator();
	 System.out.println("EID\tNAME\tAGE");
	 while(s.hasNext()) {
		 Employee vsp=s.next();
		 System.out.println(vsp.eid+"\t"+vsp.ename+"\t"+vsp.eage);
		 
	 }
		}
		
	}

