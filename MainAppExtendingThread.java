package com.edu;

class Fist extends Thread{
	public void run() {
		int a=7;
		System.out.println(a);
	}
	
}

class Iron extends Fist{
	public void run() {
		int a=25;
		System.out.println(a);
		Display();
	}
	void Display() {
		System.out.println("In The Display");
	}
}


public class MainAppExtendingThread {

	public static void main(String[] args) {
		
		Iron vjs=new Iron();
		Thread vj=new Thread(vjs);
		vj.start();
	}

}
