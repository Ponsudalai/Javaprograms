package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertPrePardApp {

	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
		String un="root";
		String pass="root";
		String url="jdbc:mysql://localhost:3306/sudalai";
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
	
		try {
			Class.forName(driver);
			 conn=DriverManager.getConnection(url,un,pass);
           
			 
			 System.out.println("Enter name");
			 String n=sc.nextLine();
			 System.out.println("Enter Id");
			 int id=sc.nextInt();
			 System.out.println("Enter dept Id");
			 int did=sc.nextInt();
			 
			 String sel="select * from emp where eid=?";
			 
			 pst=conn.prepareStatement(sel);
			 pst.setInt(1, id);
			 rs=pst.executeQuery();
			 
			 if(rs.next()) {
				 System.out.println("Employee id exists");
			 }
			 else {
				 String ins="insert into emp values(?,?,?)";
				 pst=conn.prepareStatement(ins);
				 pst.setInt(1, id);
				 pst.setString(2, n);
				 pst.setInt(3, did);
				 
				 int i=pst.executeUpdate();
				 if(i>0) {
					 System.out.println("Record is inserted");
				 }else {
					 System.out.println("Error occurred");
				 }
				 
			 }
			 
			 

	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
