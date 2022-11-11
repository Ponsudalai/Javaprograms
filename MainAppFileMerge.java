package com.edu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class MainAppFileMerge {

	public static void main(String[] args) throws IOException {
		FileInputStream vjs=new FileInputStream("Prince Of Presia.txt");
		FileInputStream vj=new FileInputStream("God Of War.txt");
		
		FileOutputStream np=new FileOutputStream("Games.txt");
		
		SequenceInputStream sisi=new SequenceInputStream(vjs,vj);
		
		int i;
		while((i=sisi.read())!=-1) {
			np.write(i);
		}
		sisi.close();
		np.close();
		vjs.close();
		vj.close();
	}

}
