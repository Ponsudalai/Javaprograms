package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {

	public static void main(String[] args) {
		
		
			String driver="com.mysql.cj.jdbc.Driver";
			String un="root";
			String pass="root";
			String url="jdbc:mysql://localhost:3306/sudalai";
			Connection conn=null;
			Statement st=null;
			ResultSet rs=null;
			try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,un,pass);
			st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			String n=sc.next();
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			System.out.println("Enter dept id");
			int did=sc.nextInt();

			String s="select * from  emp where eid="+id;
			//to check whether eid exits
			rs=st.executeQuery(s);//select
			if(rs.next()) {
			System.out.println("Employee id already exists");
			} //if eid is there not go to insert
			else {

			String ins="insert into emp values("+id+",'"+n+"',"+did+")";
			int i=st.executeUpdate(ins);//insert, update and delete
			if(i>0) {
			System.out.println("Record is inserted");
			}else {
			System.out.println("Record not inserted");
			}

			}

			}catch(Exception e) {
			e.printStackTrace();
			}

			}

			}

