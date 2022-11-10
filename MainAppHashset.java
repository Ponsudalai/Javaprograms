package edu.com.setint;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainAppHashset {

	public static void main(String[] args) {
		Set<Integer>psp=new HashSet<Integer>();
		
		psp.add(90);
		psp.add(65);
		psp.add(65);
		psp.add(89);
		psp.add(null);
		
		System.out.println(psp);
		
		
		ArrayList<Integer>ps=new ArrayList<Integer>();
		ps.add(98);
		ps.add(67);
		ps.add(23);
		ps.add(23);
		ps.add(98);
		
		System.out.println(ps);
		
		Set<Integer>ns=new HashSet<Integer>(ps);
		System.out.println("After The removing Duplicate: "+ns);

	}

}
