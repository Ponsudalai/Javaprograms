package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Product{
	
	int pid;
	String pname;
	float pprice;
	
	public Product() {
		Scanner ps=new Scanner(System.in);
	System.out.println("Enter your product ID");
	pid=ps.nextInt();
	System.out.println("Enter Product Name");
	pname=ps.next();
	System.out.println("Enter Product Price");
	pprice=ps.nextFloat();
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
}

public class UserInputProduct {

	public static void main(String[] args) {
		ArrayList<Product>e=new ArrayList<Product>();
		Product s1=new Product();
		Product s2=new Product();
		Product s3=new Product();
		Product s4=new Product();
		
		e.add(s1);
		e.add(s2);
		e.add(s3);
		e.add(s4);
		
		System.out.println(e);
		System.out.println("*****************************************");
		
		Iterator<Product>ns=e.iterator();
		System.out.println("PID\tNAME\t   PRICE");
		while(ns.hasNext()) {  
			Product sob=ns.next();
			System.out.println(sob.pid+"\t"+sob.pname+"\t  "+sob.pprice);
		}
	}

}
