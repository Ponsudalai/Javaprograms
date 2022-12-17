package com.edu;

import java.util.Scanner;

public class MainAll {

	public static void main(String[] args) {
		int v;
		Scanner ps=new Scanner(System.in);
		while(true) {
		
			System.out.println("****** SELECT THE BUS ******");
			System.out.println("1. MUTHU TRAVELS");
			System.out.println("Chennai-to-Tuticorn");
			System.out.println("Ticket Fare: 540");
			System.out.println("---------------------------------------------------");
			System.out.println("2. SMS TRAVELS");
			System.out.println("Chennai-to-Bengaluru");
			System.out.println("Ticket Fare: 620");
			System.out.println("---------------------------------------------------");
			System.out.println("3. PARVEEN TRAVELS");
			System.out.println("Chennai-to-Hyderabad");
			System.out.println("Ticket Fare: 700");
			System.out.println("---------------------------------------------------");
			System.out.println("4. FREE BIRD TRAVELS");
			System.out.println("Chennai-to-Kerala");
			System.out.println("Ticket Fare: 590");
			System.out.println("---------------------------------------------------");
			System.out.println("5. DISPLAY PASSENGER LIST");
			System.out.println("--------------------------------");
			System.out.println("6. CANCEL THE TICKET FROM MUTHU BUS");
			System.out.println("---------------------------------------------------");
			System.out.println("7. CANCEL THE TICKET FROM SMS BUS");
			System.out.println("---------------------------------------------------");
			System.out.println("8. CANCEL THE TICKET FROM PARVEEN BUS");
			System.out.println("---------------------------------------------------");
			System.out.println("9. CANCEL THE TICKET FROM FREEBIRD BUS");
			System.out.println("---------------------------------------------------");
			System.out.println("Enter Your Choice");
			v=ps.nextInt();
		
			
		switch (v) {
		
		case 1:System.out.println("Your Select The Muthu Travels ");
		System.out.println("This Bus Goes To Chennai-to-Tuticorin");
		MainAppOprations.MuthuTravels();
		break;
		case 2:System.out.println("Your Select The SMS Travels");
		System.out.println("This Bus Goes To Chennai-to-Bengaluru");
		MainAppOprations.SMSTravels();
		break;
		case 3:System.out.println("Your Select The Parveen Travels");
		System.out.println("This Bus Goes To Chennai-to-Hyderabad");
		MainAppOprations.ParveenTravels();
		break;
		case 4:System.out.println("Your Select The Free Bird Travels");
		System.out.println("This Bus Goes To Chennai-to-Kerala");
		MainAppOprations.FreebirdTravels();
		break;
		case 5:System.out.println("The Passenger List");
		MainAppOprations.display();
		break;
		case 6:System.out.println("Ticket Cancellation");
		MainAppOprations.ticketc();
		break;
		case 7:System.out.println("Ticket Cancellation");
		MainAppOprations.ticketc1();
		break;
		case 8:System.out.println("Ticket Cancellation");
		MainAppOprations.ticketc2();
		break;
		case 9:System.out.println("Ticket Cancellation");
		MainAppOprations.ticketc3();
		break;
		default: System.out.println("Your Enter The Unknown Number");
		}
		System.out.println("Do You Want To Continue To Travel Y-yes Or N-no :");
		char choice=ps.next().charAt(0);
		if(choice=='n') {
			break;
		}
			}
		System.out.println("Thank You Happy Journey :)");
	}

}
