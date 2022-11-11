package com.edu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainAppFileReadAndWrite {

	public static void main(String[] args) throws IOException {
		FileInputStream vjs=new FileInputStream("Prince Of Presia.txt");
		FileOutputStream vj=new FileOutputStream("God Of War.txt");
		int i=0;
		while((i=vjs.read())!=-1) {
			
			if(i>=97 && i<=122) {
				vj.write(i-32);	
				System.out.print((char)(i-32));
			}
			else {
				vj.write(i);
				System.out.print((char)(i));
			}
			
		}
		System.out.println(" Your File Is Ready God Of War.txt");
		vjs.close();
		vj.close();
	}

}
