package types;

import java.util.Scanner;

public class Inputarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pi,r; //declaration
		pi=22/7;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The R Value ");
		r=sc.nextInt();
		
		
		//display the value\
		
		System.out.println("The Arae Of Arae "+pi*(r*r));
	}

}
