package edu.com.setint;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainAppLinkedHashSet {

	public static void main(String[] args) {
		Set<Integer>psp=new LinkedHashSet<Integer>();
		
		psp.add(90);
		psp.add(65);
		psp.add(65);
		psp.add(89);
		psp.add(null);
		
		System.out.println(psp);

	}

}
