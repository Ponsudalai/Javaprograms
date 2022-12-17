package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {

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

		System.out.println("Enter Employee id");
		int id=sc.nextInt();
		String s="select * from  emp where eid="+id;
		//to check whether eid exits
		rs=st.executeQuery(s);//select
		if(rs.next()) {
		//if employee id exits then go for delete
		System.out.println("Enter name to change");
		String n=sc.next();
		String up="update emp set ename='"+n+"' where eid="+id;
		//update emp set ename='siva' where eid=1121
		int i=st.executeUpdate(up);
		if(i>0) {
		System.out.println("Name is changed");
		}else {
		System.out.println("Some error occurred");
		}
		}else {
		System.out.println("Employee id not exits update is not possible");
		}

		}catch(Exception e) {
		e.printStackTrace();
		}

		}

		}
