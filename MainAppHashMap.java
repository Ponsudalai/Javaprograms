package com.edumap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MainAppHashMap {

	public static void main(String[] args) {
			
		HashMap<Long, String>vj=new HashMap<Long, String>();
		
		vj.put(45581236l,"James");
		vj.put(65468485l,"Jack");
		vj.put(35451536l,"Gibbs");
		
		System.out.println(vj);
		System.out.println("*********************");
		
		Set<Entry<Long,String>>npps=vj.entrySet();
		
		for(Entry<Long ,String>vjs:npps) {
			System.out.println(vjs.getKey()+" : "+vjs.getValue());
			
		}
		System.out.println("*********************");

	}

}
