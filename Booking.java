package com.edu;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Booking {

	String pname;
	int bno;
	char s;
	long p;
	float amt;
	java.util.Date date;
	
	Booking(){
		
		Scanner np=new Scanner(System.in);
		System.out.println("Enter Passenger Name: ");
		pname=np.nextLine();
		System.out.println("Enter Bus No: ");
		bno=np.nextInt();
		System.out.println("Enter Your Gender M/F : ");
		s=np.next().charAt(0);
		System.out.println("Enter Your Phone Number: ");
		p=np.nextLong();
		System.out.println("Enter Date Of Travel (dd-mm-yyyy): ");
		String dateInput=np.next();
		System.out.println("Enter Your Amount: ");
		amt=np.nextFloat();
		if(amt<500) {
			System.out.println("Not Enough!");
		}
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date=dateformat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Your Name: "+pname);
		System.out.println("Your BusNo: "+bno);
		System.out.println("Your Gender: "+s);
		System.out.println("Your PhoneNo: "+p);
		System.out.println("Your Taveal Date: "+dateInput);
		System.out.println("Your Paid Amount: "+amt);
		
	}

	
	public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>Buses) {
		int capcity=0;
		for(Bus bus:Buses) {
			if(bus.setBus()==bno) 
				capcity=bus.setCapcity();
			
		}
		int booked=0;
		for(Booking b:bookings) {
			if(b.bno==bno && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capcity?true:false; 
		
	}
	
}
