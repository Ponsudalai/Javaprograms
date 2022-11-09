package com.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class FloatListElementMain {

	public static void main(String[] args) {
		
			ArrayList<Float> ps=new ArrayList<Float>();
			Scanner np=new Scanner(System.in);
			System.out.println("Enter Your Number");
			float a=np.nextFloat();
			ps.add(a);
			float b=np.nextFloat();
			ps.add(b);
			
			System.out.println(ps);
			
			for(float n:ps) {
				System.out.println(n);
			}
	}

}
