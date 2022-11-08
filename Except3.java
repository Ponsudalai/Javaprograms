package com.edu;

import java.util.Scanner;

public class Except3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner ps=new Scanner (System.in);
		System.out.println("Enter Your Age ");
		age=ps.nextInt();
		try {
			if(age<18)throw new ArithmeticException("Your Not Eligible To Voteing");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
