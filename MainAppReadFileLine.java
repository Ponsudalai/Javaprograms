package com.edu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAppReadFileLine {

	public static void main(String[] args) throws IOException {
	
			FileInputStream vjs=new FileInputStream("God Of War.txt");
			BufferedReader vj=new BufferedReader(new InputStreamReader(vjs));
			
			String s=null;
			while((s=vj.readLine())!=null) {
				System.out.println(s);
			}
			
	}

}
