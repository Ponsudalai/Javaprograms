package com.edu;

public class Except1 {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int ar[]=new int [4];
		System.out.println("Before Divistion");
		System.out.println("Before Array Assignment");
		try {
		c=a/b;
		ar[3]=90;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();// Catch Will Execute Only When Exception Only 
		}
		finally {
			System.out.println("Finally Block Will Execute Always");
		}
		System.out.println("After Divition");
		System.out.println("After Array Assignment");
	}

}
