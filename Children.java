package com.p2;

import com.p1.*;


class simple extends hardClass{
	int s;
		simple(int a, int b) {
		super(a, b);
		
	}
		void add() {
			s=a+b;
			System.out.println("The Sum= "+s);
		}
}
public class Children{

	public static void main(String[] args) {
	simple ps=new simple(80, 90);
	ps.add();
	hardClass ns=new hardClass(80, 90);
System.out.println("protectd data="+ns.k);
	}

}

