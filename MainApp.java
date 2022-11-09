package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<Integer>ps=new ArrayList<Integer>();
		ps.add(17);
		ps.add(27);
		ps.add(37);
		
		System.out.println(ps);
		
		System.out.println(ps.contains(13));
		ArrayList<Integer>ns=new ArrayList<Integer>();
		ns.add(117);
		ns.add(227);
		ns.add(337);
		
		ps.addAll(ns);
		System.out.println(ps);
		
		Iterator<Integer>ps1=ns.iterator();
		while(ps1.hasNext()) {
			System.out.println(ps1.next()+" ");
		}
		
	}

}
