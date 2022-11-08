package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IndianBank{
	private String n,pa;
	
	public void InputData() throws IOException {
		BufferedReader ps=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your UserName");
		n=ps.readLine();
		System.out.println("Enter Your Password");
		pa=ps.readLine();
		
	}
	public int DisplayData() {
		if(n.equalsIgnoreCase("lenovo")&&(pa.equals("lenovo123"))) {
			System.out.println("Your Logined");
			return 1;
		}
		else {
			System.out.println("Invalid User");
		}
		return 0;
	}
}


public class BankLogin {

	public static void main(String[] args) throws IOException {
		
		IndianBank ns=new IndianBank();
		int flag=-1;
		System.out.println("*******LOGIN PAGE********");
		System.out.println("You Have Only 3 times Chance");
		int count=3;
		while(count>0) {
			ns.InputData();
			flag=ns.DisplayData();
			if(flag==1) {
				break;
			}
			else {
				count=count-1;
				System.out.println("you Have "+count+" times");
			}
		}
		if(flag==0) {
			System.out.println("Your Account Is Freezed 24 Hrs");
		}
	}

}
