package com.edu;

import java.util.Scanner;

public class MainAppPrime {

	public static void main(String[] args) {
		int a,c=0;
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter Your Number");
		a=ps.nextInt();
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				c=c+1;
			}
		}
		if(c==2) {
			System.out.println(a+" Its Prime Number ");
		}
		else {
			System.out.println(a+ " Its Not Prime Number ");
		}
	}

}
