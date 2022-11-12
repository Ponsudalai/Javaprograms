package com.edu;

class ThreadClass extends Thread{
	public void run() {
		System.out.println("Run Method Called"+Thread.currentThread());
		
	}
}

public class MainAppChangePriorty {

	public static void main(String[] args) {
	    
		ThreadClass vjs=new ThreadClass();
		vjs.setPriority(4);
		System.out.println("Thread Priorty "+vjs.getPriority());
		vjs.start();
		ThreadClass vj=new ThreadClass();
		vj.setPriority(Thread.MAX_PRIORITY);
		vj.setPriority(7);
		System.out.println("Thread priorty "+vj.getPriority());
		vj.start();
		

	}

}
