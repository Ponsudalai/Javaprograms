package com.edu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseAllOperations {

	 private static Connection conn=null;
	  private static Statement st=null;
	  private static ResultSet rs=null;
		public static void displayRecord() {
			try {
		       conn=DataBaseConnection.getConnection();	
		       Statement st=conn.createStatement();
				
				String s="select * from emp";
				
				ResultSet rs=st.executeQuery(s);
				System.out.println("Eid\tEname\tDeptId");
				System.out.println("----------------------------------");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
				}
				
			  }catch(Exception e) {
				e.printStackTrace();
			}
		        
		
	}

	public static void insertRecord() {
		try {
			conn=DataBaseConnection.getConnection();
			st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name");
			String n=sc.next();
			System.out.println("Enter Employee Id");
			int id=sc.nextInt();
			System.out.println("Enter Dept Id");
			int did=sc.nextInt();
			String s="select * from  emp where eid="+id;
			rs=st.executeQuery(s);
			if(rs.next()) {
				System.out.println("Employee Id Already Exists");
			} 
			else {
				String ins="insert into emp values("+id+",'"+n+"',"+did+")";
				int i=st.executeUpdate(ins);
				if(i<0) {
					System.out.println("Record Is Inserted");
				}else {
					System.out.println("Record Not Inserted");
				}
				
			}
			
			}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
		
	

	public static void updateRecord() {
		
		try {
			
			 conn=DataBaseConnection.getConnection();
			 st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name To Change");
			String n=sc.nextLine();
			System.out.println("Enter Employee Id");
			int id=sc.nextInt();
			String s="select * from  emp where eid="+id;
			rs=st.executeQuery(s);
			if(rs.next()) {
				String up="update emp set ename='"+n+"' where eid="+id;
				int i=st.executeUpdate(up);
				if(i>0) {
					System.out.println("Name is Changed");
				}else {
					System.out.println("Some Error Occurred!!!!!");
				}
			}else {
				System.out.println("Employee Id Not Exits Update Is Not Possible");
			}
			
			}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void deleteRecord() {
		try {
			
			 conn=DataBaseConnection.getConnection();
			 st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee Id");
			int id=sc.nextInt();
			String s="select * from  emp where eid="+id;
			rs=st.executeQuery(s);
			if(rs.next()) {
				String del="delete from emp where eid="+id;
				int i=st.executeUpdate(del);
				if(i>0) {
					System.out.println("Record Is Deleted");
				}else {
					System.out.println("Some Error Occurred!!!!!!!");
				}
			}else {
				System.out.println("Employee Id Not Exits Deletion Is Not Possible");
			}
			
			}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
		
	}
	
	
	


