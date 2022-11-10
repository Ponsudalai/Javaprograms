package com.edumap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MainAppTreeMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String>tm=new LinkedHashMap<Integer, String>();
		tm.put(123, "Jack");
		tm.put(456, "Gibbs");
		tm.put(234, "Hendry");
		tm.put(876, "James");
		System.out.println(tm);

	}

}
