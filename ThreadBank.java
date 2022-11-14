package com.edu;

class Customer {
	int amount=10000;
	synchronized void WithDraw(int wamount) {
		System.out.println("Going To Withdraw...............");
		
		if(this.amount<wamount) {
			System.out.println("Less Balance;Waiting For Deposite");
			try {
				System.out.println("Before Waiting");
				wait();
				System.out.println("After Waiting");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("Withdraw Completed...........");
	}
	synchronized void Deposit(int amount) {
		System.out.println("Going To Deposit............");
		notify();
	}
}

public class ThreadBank {

	public static void main(String[] args) {
	
		final Customer c=new Customer();
		new Thread() {
			public void run() {
				c.WithDraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.Deposit(10000);
			}
		}.start();
	}

}
