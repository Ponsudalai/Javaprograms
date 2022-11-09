package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

public class StringListElementsMain {

	public static void main(String[] args) {
		
		ArrayList<String> lst=new ArrayList<String>();
		lst.add("Narignton");
		lst.add("Hendry");
		lst.add("Gibbs");
		lst.add("Jack");
		
		
		System.out.println(lst);
		
		for(String n:lst) {
			System.out.println(n);
		}
		Iterator<String>ps=lst.iterator();
		while(ps.hasNext()) {
			System.out.println(ps.next());
		}

	}

}
