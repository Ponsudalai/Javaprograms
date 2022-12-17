package com.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class BusReservation {

	public static void main(String[] args) {
		
		ArrayList<Bus> Buses= new ArrayList<Bus>();
		ArrayList<Booking>Bookings=new ArrayList<Booking>();
		
		Buses.add(new Bus(1,true,2));
		Buses.add(new Bus(2,false,5));
		Buses.add(new Bus(3,true,1));
		
		
	      int useropt=1;
	      Scanner ps=new Scanner(System.in);
	      
	      for(Bus b:Buses) {
	    	  b.displayBusInfo();
	      }
	      
	      while(useropt==1) {
		System.out.println("Enter 1 to Booking And 2 To Exit");
		 useropt=ps.nextInt();
		 if(useropt==1) {
			
			 Booking bookings=new Booking();
			 if(bookings.isAvailable(Bookings,Buses)) {
				 Bookings.add(bookings);
				 System.out.println("Your Booking Is Confirmed");
			 }
			 else {
				 System.out.println("Sorry Bus Is Full.Try Another Bus Or Date.......");
			 }
		 }
	      }
	     
	     System.out.println("Thank You For Visting Our Site :) "); 
	}

}
