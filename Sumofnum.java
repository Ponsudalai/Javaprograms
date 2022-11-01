package find;

import java.util.Scanner;

class Bank {
	float amount;
	Bank(){
		amount=1000;
		System.out.println("constructer is called");
	}
	void deposit(float damount) {
		amount=amount+damount;
		System.out.println("After Deposit Bank Balance="+amount);
	}
	void withdraw(float wamount) {
		if(wamount>amount) {
			System.out.println("insuffient Balance");
		}
		else
		{
			amount=amount-wamount;
			System.out.println("After Withdraw Bank Balance="+amount);
		}
	}
	public void displayAmount() {
		System.out.println("Bank Balance ="+amount);
	}
}

public class Sumofnum {

	public static void main(String[] args) {
		Bank ns=new Bank();
		int choice;
		while (true) {
		Scanner ps=new Scanner(System.in);
		System.out.println("************ ALLABAD BANK ATM *************");
		System.out.println(" 1. DEPOSITE");
		System.out.println(" 2. WITHDRAW AMOUNT");
		System.out.println(" 3. DISPLAY");
		System.out.println(" 4. EXIT");
		choice=ps.nextInt();
		
		switch(choice) {
		case 1:System.out.println("ENTER THE AMOUNT OF DEPOSITE");
		float damt=ps.nextFloat();
		ns.deposit(damt);
		break;
		case 2:System.out.println("ENTER THE AMOUNT OF WIDTHDRAW");
		float wamt=ps.nextFloat();
		ns.withdraw(wamt);
		break;
		case 3:System.out.println("MY BANK BALANCE :");
		ns.displayAmount();
		break;
		case 4:System.out.println(" THANK FOR VISIT ");
		System.exit(0);;
		
			}
		}
	}

}
