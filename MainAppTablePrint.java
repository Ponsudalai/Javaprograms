package com.edu;

class Table7{
	synchronized void methodPrint(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+"x"+num+"="+num*i);
		}
	}
	
}

public class MainAppTablePrint {

	public static void main(String[] args) {
		
	Table7 ps=new Table7();
	Thread np=new Thread() {
		
		public void run() {
			ps.methodPrint(5);
		}
	};
	np.start();
	
	Thread npps=new Thread() {
		
		public void run() {
			ps.methodPrint(10);
		}
	};
	npps.start();
	}
	

}
