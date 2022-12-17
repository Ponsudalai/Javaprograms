package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

public class ListItrateUsingLambda {

	public static void main(String[] args) {
		ArrayList<Integer>ps=new ArrayList<Integer>();
		
		
		for(int i=1;i<=5;i++) {
			ps.add(i);
		}
		Iterator<Integer>vjs=ps.iterator();
		while(vjs.hasNext()) {
			System.out.println(vjs.next());
		}
		
		ps.forEach(x->System.out.print(x+" "));
	}

}
