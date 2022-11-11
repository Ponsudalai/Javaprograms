package com.edu;

import java.io.FileInputStream;

public class MainAppFileReading {

	public static void main(String[] args) {
		try {
		FileInputStream vjs=new FileInputStream("Prince Of Presia.txt");
		int i=0;
		while((i=vjs.read())!=-1) {
			System.out.print((char)i);
		}
		vjs.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
