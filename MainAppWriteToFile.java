package com.edu;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainAppWriteToFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream vjs=null;
		try {
			vjs=new FileOutputStream("MyFile.txt");
			vjs.write(83);
			vjs.write(65);
			vjs.write(80);
			vjs.write(82);
			vjs.write(82);
			vjs.write(79);
			vjs.write(87);
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			vjs.close();
		}
		System.out.println("Ready To View");

	}

}
