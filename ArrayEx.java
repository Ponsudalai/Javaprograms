package com.edu;

public class ArrayEx {

	public static void main(String[] args) {
		int a[]= new int[4];
		
		System.out.println("Before Asign The Array Value");
		try {
		a[0]=89;
		a[1]=88;
		a[2]=87;
		a[3]=86;
		a[4]=85;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("After The Asign The Values");
	}

}
