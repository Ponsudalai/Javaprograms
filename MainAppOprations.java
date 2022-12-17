package com.edu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MainAppOprations {
	
	private static Connection conn=null;
	private static Statement st=null;
	private static ResultSet rs=null;

	public static void MuthuTravels() {
		try {
			conn=MainAppConnection.getConnection();
		st=conn.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Seat No: ");
		int d=sc.nextInt();
		System.out.println("Enter Date Of Travel (dd-mm-yyyy): ");
		String dateInput=sc.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter Passenger Name: ");
		String n=sc.next();
		System.out.println("Enter Passenger Age: ");
		int id=sc.nextInt();
		System.out.println("Enter Passenger Mobile No:");
		String did=sc.next();
		System.out.println("Enter Your Amount Rs.540: ");
		float x=sc.nextFloat();
		String s="select * from  muthu where s_no="+d;
		rs=st.executeQuery(s);
		if(rs.next()) {
			System.out.println("This Seat All Ready Booked................");
		} 
		else {
			String ins="insert into muthu values("+d+",'"+n+"',"+id+","+x+",'"+dateInput+"','"+did+"')";
			int i=st.executeUpdate(ins);
			if(i>0) {
				System.out.println("Your Ticket Is Booked In Muthu BUS :)");
			}else {
				System.out.println("Your Booking Is Not Confirmed!!!!!");
			}
			
		}
		
		}catch(Exception e) {
		e.printStackTrace();
	}
		
		
	}

	public static void SMSTravels() {
		try {
			conn=MainAppConnection.getConnection();
		st=conn.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Seat No:");
		int d=sc.nextInt();
		System.out.println("Enter Date Of Travel (dd-mm-yyyy): ");
		String dateInput=sc.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter Passenger Name: ");
		String n=sc.next();
		System.out.println("Enter Passenger Age: ");
		int id=sc.nextInt();
		System.out.println("Enter Passenger Mobile No:");
		String did=sc.next();
		System.out.println("Enter Your Amount Rs.620: ");
		float x=sc.nextFloat();
		
		String s="select * from  sms where s_no="+d;
		rs=st.executeQuery(s);
		if(rs.next()) {
			System.out.println("This Seat All Ready Booked................");
		} 
		else {
			String ins="insert into sms values("+d+",'"+n+"',"+id+","+x+",'"+dateInput+"','"+did+"')";
			int i=st.executeUpdate(ins);
			if(i>0) {
				System.out.println("Your Ticket Is Booked In SMS BUS :)");
			}else {
				System.out.println("Your Booking Is Not Confirmed!!!!!");
			}
			
		}
		
		}catch(Exception e) {
		e.printStackTrace();
	}
		
		
	}

		
	public static void ParveenTravels() {
		try {
			conn=MainAppConnection.getConnection();
		st=conn.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Seat No:");
		int d=sc.nextInt();
		System.out.println("Enter Date Of Travel (dd-mm-yyyy): ");
		String dateInput=sc.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter Passenger Name:");
		String n=sc.next();
		System.out.println("Enter Passenger Age:");
		int id=sc.nextInt();
		System.out.println("Enter Passenger Mobile No:");
		String did=sc.next();
		System.out.println("Enter Your Amount Rs.700: ");
		float x=sc.nextFloat();
		
		String s="select * from  parveen where s_no="+d;
		rs=st.executeQuery(s);
		if(rs.next()) {
			System.out.println("This Seat All Ready Booked................");
		} 
		else {
			String ins="insert into parveen values("+d+",'"+n+"',"+id+","+x+",'"+dateInput+"','"+did+"')";
			int i=st.executeUpdate(ins);
			if(i>0) {
				System.out.println("Your Ticket Is Booked In Parveen BUS :)");
			}else {
				System.out.println("Your Booking Is Not Confirmed!!!!!");
			}
			
		}
		
		}catch(Exception e) {
		e.printStackTrace();
	}
	
		
	}

	public static void FreebirdTravels() {
		try {
			conn=MainAppConnection.getConnection();
		st=conn.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Seat No:");
		int d=sc.nextInt();
		System.out.println("Enter Date Of Travel (dd-mm-yyyy): ");
		String dateInput=sc.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter Passenger Name:");
		String n=sc.next();
		System.out.println("Enter Passenger Age:");
		int id=sc.nextInt();
		System.out.println("Enter Passenger Mobile No:");
		String did=sc.next();
		System.out.println("Enter Your Amount Rs.590: ");
		float x=sc.nextFloat();
		
		String s="select * from  free where s_no="+d;
		rs=st.executeQuery(s);
		if(rs.next()) {
			System.out.println("This Seat All Ready Booked................");
		} 
		else {
			String ins="insert into free values("+d+",'"+n+"',"+id+","+x+",'"+dateInput+"','"+did+"')";
			int i=st.executeUpdate(ins);
			if(i>0) {
				System.out.println("Your Ticket Is Booked In Free Bird BUS :)");
			}else {
				System.out.println("Your Booking Is Not Confirmed!!!!!");
			}
			
		}
		
		}catch(Exception e) {
		e.printStackTrace();
	}
		
		
	}

	public static void display() {
		System.out.println("Muthu Bus Passenger List:");
		try {
		conn=MainAppConnection.getConnection();
		Statement st=conn.createStatement();
		
		String s="select * from muthu";
		ResultSet rs=st.executeQuery(s);
		System.out.println("Passenger SeatNo\tPassenger Name\t Passenger Age \t Amount\t Date \t Passenger Mobile No");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getFloat(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Parveen Bus Passenger List:");
		try {
			conn=MainAppConnection.getConnection();
			Statement st=conn.createStatement();
			
			String s="select * from parveen";
			ResultSet rs=st.executeQuery(s);
			System.out.println("Passenger SeatNo\tPassenger Name\t Passenger Age \t Amount\t Date \t Passenger Mobile No");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getFloat(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("SMS Bus Passenger List:");
		try {
			conn=MainAppConnection.getConnection();
			Statement st=conn.createStatement();
			
			String s="select * from sms";
			ResultSet rs=st.executeQuery(s);
			System.out.println("Passenger SeatNo\tPassenger Name\t Passenger Age \t Amount\t Date \t Passenger Mobile No");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getFloat(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("FreeBird Bus Passenger List:");
		try {
			conn=MainAppConnection.getConnection();
			Statement st=conn.createStatement();
			
			String s="select * from free";
			ResultSet rs=st.executeQuery(s);
			System.out.println("Passenger SeatNo\tPassenger Name\t Passenger Age \t Amount\t Date \t Passenger Mobile No");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getFloat(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
	}

	
	
	

	public static void ticketc() {
		
try {
			
			conn=MainAppConnection.getConnection();
			 st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Mobile No:");
			String id=sc.next();
			String s="select * from  muthu where p_mobile="+id;
			rs=st.executeQuery(s);
			if(rs.next()) {
				String del="delete from muthu where p_mobile ="+id;
				int i=st.executeUpdate(del);
				if(i>0) {
					System.out.println("Your Ticket Is Canceled :-(");
				}else {
					System.out.println("Some Error Occurred!!!!!!!");
				}
			}else {
				System.out.println("The Passenger Not Booked Tickets!");
			}
			
			}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void ticketc1() {
try {
			
			conn=MainAppConnection.getConnection();
			 st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Mobile No:");
			String id=sc.next();
			String s="select * from  sms where p_mobile="+id;
			rs=st.executeQuery(s);
			if(rs.next()) {
				String del="delete from sms where p_mobile ="+id;
				int i=st.executeUpdate(del);
				if(i>0) {
					System.out.println("Your Ticket Is Canceled :-(");
				}else {
					System.out.println("Some Error Occurred!!!!!!!");
				}
			}else {
				System.out.println("The Passenger Not Booked Tickets!");
			}
			
			}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void ticketc2() {
try {
			
			conn=MainAppConnection.getConnection();
			 st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Mobile No:");
			String id=sc.next();
			String s="select * from parveen where p_mobile="+id;
			rs=st.executeQuery(s);
			if(rs.next()) {
				String del="delete from parveen where p_mobile ="+id;
				int i=st.executeUpdate(del);
				if(i>0) {
					System.out.println("Your Ticket Is Canceled :-(");
				}else {
					System.out.println("Some Error Occurred!!!!!!!");
				}
			}else {
				System.out.println("The Passenger Not Booked Tickets!");
			}
			
			}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void ticketc3() {
try {
			
			conn=MainAppConnection.getConnection();
			 st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Mobile No:");
			String id=sc.next();
			String s="select * from free where p_mobile="+id;
			rs=st.executeQuery(s);
			if(rs.next()) {
				String del="delete from free where p_mobile ="+id;
				int i=st.executeUpdate(del);
				if(i>0) {
					System.out.println("Your Ticket Is Canceled :-(");
				}else {
					System.out.println("Some Error Occurred!!!!!!!");
				}
			}else {
				System.out.println("The Passenger Not Booked Tickets!");
			}
			
			}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

		
	}

	


