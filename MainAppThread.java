package com.edu;

class MyThread extends Thread
{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("In Side Run Method "+Thread.currentThread());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
	}
}	


public class MainAppThread {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Thread"+Thread.currentThread());
		MyThread vjs=new MyThread();
		vjs.setName("FirstThread");
		vjs.start();
		vjs.join();
		MyThread vj1=new MyThread();
		vj1.setName("SecondThread");
		vj1.start();

	}

}
