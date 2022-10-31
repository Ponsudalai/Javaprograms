package types;

import java.util.Scanner;

public class Employeep {
	
	int eid;
	String ename;
	float esalary; 
	String edept;
	
	void inputData() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Emp Name");
		ename=sc.next();
		System.out.println("Enter The Emp Id");
		eid=sc.nextInt();
		System.out.println("Enter The Emp Salary");
		esalary=sc.nextFloat();
		System.out.println("Enter The Emp Edept");
		edept=sc.next();
		
		
	}
	
	void display() {
		
		System.out.println("Name:"+ename);
		System.out.println("Emp Id:"+eid);
		System.out.println("Emp Salary:"+esalary);
		System.out.println("Emp Dept:"+edept);
	}

	public static void main(String[] args) {
		
		Employeep eob= new Employeep();
		Employeep eob1= new Employeep();
		Employeep eob2= new Employeep();
		
		eob.inputData();
		eob1.inputData();
		eob2.inputData();
		
		eob.display();
		eob1.display();
		eob2.display();

	}

}
