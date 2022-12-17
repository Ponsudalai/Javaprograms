package com.edu;

class Table{
	synchronized void methodPrint(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
	
}
class MyThread1 extends Thread {
	Table vjs;
	MyThread1(Table p){
		vjs=p;
	}
	public void run() {
		vjs.methodPrint(3);
	}
}
class MyThread2 extends Thread{
	Table vj;
	MyThread2(Table n){
		vj=n;
	}
	public void run() {
		vj.methodPrint(7);
	}
}
public class MainTablePrint {

	public static void main(String[] args) {
		Table ps=new Table();
		MyThread1 np=new MyThread1(ps);
		np.setName("Three");
		np.start();
		MyThread2 npps=new MyThread2(ps);
		npps.setName("Seven");
		npps.start();
		
	}

}
