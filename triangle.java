package com.edu;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		
		int r;
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter The Number");
		r=ps.nextInt();
		
		for(int i=1;i<=r;i++) {
			for (int b=1;b<=r-i;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}

	}
}
