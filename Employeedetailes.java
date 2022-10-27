package types;

import java.util.Scanner;

public class Employeedetailes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Ename;
		int Eage;
		float Esalary,b;
		b=12f;
		String Edept;
		double Eyearsalary;
		
		Scanner sc=new Scanner(System.in);
	     
	  
	     
	    
		System.out.println("Enter Employee Name");
		Ename=sc.nextLine();
		System.out.println("Enter Employee age");
		Eage=sc.nextInt();
		System.out.println("Enter Employee Salary");
		Esalary=sc.nextFloat();
		System.out.println("Eneter Employee Depatment");
		Edept=sc.next();
		System.out.println("Enter Employee Month Salary");
		Eyearsalary=sc.nextDouble();
		
		
		//displaying detailes
		
		
		
		System.out.println("Employee Name:"+Ename);
		System.out.println("Employee Age:"+Eage);
		System.out.println("Employee Salary:"+Esalary);
		System.out.println("Employee Department:"+Edept);
		System.out.println("Employee Year Salary:"+Eyearsalary+Esalary*b);
		
		
		
		

	}

}
