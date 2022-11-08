package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class validateuser{
	private String un,pass;
	public void Inputdata() throws IOException {
		
		BufferedReader ps=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your UserName");
		un=ps.readLine();
		System.out.println("Enter Your Password");
		pass=ps.readLine();
	}
	public void usercheck() {
		if(un.equalsIgnoreCase("lenovo")&&(pass.equals("leno123"))) {
			System.out.println("SucessFully Logined");
		}
		else {
			System.out.println("invalid User");
		}
	}
}

public class UserLogin {

	public static void main(String[] args) throws IOException {
		System.out.println("*******login Page*******");
		validateuser ns=new validateuser();
		ns.Inputdata();
		ns.usercheck();

	}

}
