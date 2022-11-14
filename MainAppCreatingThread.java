package com.edu;

class Thread1 implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println(Thread.currentThread());
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
}
}

public class MainAppCreatingThread {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 vjs=new Thread1();
		Thread vj=new Thread(vjs);
		
		vj.setName("First");
		System.out.println("Is First Is Alive="+vj.isAlive());
		vj.start();
		System.out.println("Is First Is Alive="+vj.isAlive());
		vj.join();
		System.out.println("Is First Is Alive="+vj.isAlive());
		Thread vj1=new Thread(vjs);
		System.out.println("Is Second Is Alive="+vj1.isAlive());
		vj1.setName("Second");
		System.out.println("Is Second Is Alive="+vj1.isAlive());
	    vj1.start();
		System.out.println("Is Second Is Alive="+vj1.isAlive());
		
	}

}


	

