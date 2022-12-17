package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

public class MainAppStringJava8 {

	public static void main(String[] args) {
		ArrayList<String>ps=new ArrayList<String>();
		
		ps.add("Jack");
		ps.add("Gibbs");
		ps.add("James");
		
		Iterator<String>vjs=ps.iterator();
		while(vjs.hasNext()) {
			System.out.println(vjs.next());
		}
		
		ps.forEach(n->System.out.print(n+" "));
	}

}
