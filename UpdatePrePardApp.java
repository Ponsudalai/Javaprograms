package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdatePrePardApp {

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
			 
			
			
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			
			
			String s="select * from  emp where eid=?";
			pst=conn.prepareStatement(s);
			pst.setInt(1, id);
			
			rs=pst.executeQuery();
			if(rs.next()) {
				
				System.out.println("Enter name to change");
				String n=sc.next();
				
				String up="update emp set ename=? where eid=?";
				
				pst=conn.prepareStatement(up);
				pst.setString(1, n);
				pst.setInt(2, id);
				int i=pst.executeUpdate();
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
