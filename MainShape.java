package com.edu;

abstract class Shape{
	abstract void area();
}

class rectangle extends Shape{
	
	void area() {
		int a,b,c;
		a=5;
		b=4;
		c=a*b;
		System.out.println("rectangule area of: "+c);
	}
}

class Square extends Shape{
	void area() {
		int a,b;
		b=5;
		a=b*b;
		System.out.println("square area of: "+a);
	}
}
public class MainShape {

	public static void main(String[] args) {
		rectangle ps=new rectangle();
		ps.area();
		Square ns=new Square();
		ns.area();
		//
		Shape obj;
		obj=new rectangle();
		obj.area();
		obj=new Square();
		obj.area();
	}

}
