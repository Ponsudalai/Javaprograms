package com.edu;

class Product{
	int pid;
	String pname;
	public static Product vjs;
	private Product() {
		pid=0;
		pname=null;
	}
	public static Product getPoductobject() {
	if (vjs==null) {
		vjs=new Product();
		System.out.println("Object Created : "+vjs);
	}
	else {
		return vjs;
	}
	return vjs;
	}
	void Display() {
		System.out.println("Display Method Of This Program");
	}
}

public class MainClass {

	public static void main(String[] args) {
		Product vj=Product.getPoductobject();
		System.out.println("The Object In Main : "+vj);
		vj.Display();

	}

}
