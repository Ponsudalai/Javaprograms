package com.edu;

abstract class Bank{
abstract void Rateofinterst();
void display() {
	System.out.println("Non abstract method");
}
}

class SBIbank extends Bank{
	void Rateofinterst() {
		System.out.println(" SBI bank 8% of Interst");
	}
	
}
	class IOBbank extends Bank{
		void Rateofinterst() {
			System.out.println(" IOB bank 9% of Intrest");
		}
	}


public class MainAbstractMain {

	public static void main(String[] args) {
		SBIbank ps=new SBIbank();
		ps.display();
		ps.Rateofinterst();
		IOBbank ns=new IOBbank();
		ns.display();
		ns.Rateofinterst();

	}

}
