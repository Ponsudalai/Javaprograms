package edu.com.setint;


import java.util.Set;
import java.util.TreeSet;

public class MainAppTreeSet {

	public static void main(String[] args) {
		
		Set<Integer>psp=new TreeSet<Integer>();
		
		psp.add(90);
		psp.add(65);
		psp.add(65);
		psp.add(89);
		
		System.out.println(psp);
	}

}
