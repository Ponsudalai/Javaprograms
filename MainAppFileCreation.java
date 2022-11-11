package com.edu;

import java.io.File;
import java.io.IOException;

public class MainAppFileCreation {

	public static void main(String[] args) throws IOException {
		System.out.println("Creating Document");
		File New=new File("Prince Of Presia.txt");
		
		if(New.createNewFile()) {
			System.out.println("Your File Is ready");
		}
		else {
			System.out.println("Your File Is Alredy Created");
		}

	}

}
