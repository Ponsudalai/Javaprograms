package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserInputNumber {

	public static void main(String[] args) {
				
		ArrayList<Float>ps=new ArrayList<Float>();
		
		float npps;
		try (Scanner ns = new Scanner(System.in)) {
			System.out.println("Enter Number Of Elements");
			int n=ns.nextInt();
			
			for(int i=0;i<n;i++) {
				System.out.println("Enter The Float Value");
				npps=ns.nextFloat();
				ps.add(npps);
				
			}
		}
		System.out.println(ps);
			
		Iterator<Float>n1=ps.iterator();
		while(n1.hasNext()) {
			System.out.println(n1.next());
			
		}
	}
	

}
