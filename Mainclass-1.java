package com.edu;

class ParentClass{
	int a,b;
	ParentClass(){
		a=80;
		b=90;
		}
}

class Children extends ParentClass{
	int s;
	void add() {
		s=a+b;
		System.out.println("The Sum= "+s);
	}
}
public class Mainclass {

	public static void main(String[] args) {
	Children ps=new Children();
	ps.add();
	}

}
