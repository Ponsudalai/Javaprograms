package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class InsertThe {
	
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String un="root";
	private static String up="root";
	private static String url="jdbc:mysql://localhost:3306/sudalai";
	
	private static Connection conn=null;
	private static ResultSet rs=null;
	private static Statement st=null;
	

	public static void main(String[] args) {
		
Scanner in=new Scanner(System.in);
System.out.println("Enter USERNAME");
String uv=in.nextLine();
System.out.println("Enter PASSWORD");
int ps=in.nextInt();

					String s="insert into userid values('"+uv+"','"+ps+"')";
					
					try {
						Class.forName(driver);
						conn=DriverManager.getConnection(url,un,up);
						st=conn.createStatement();
						
						int i=st.executeUpdate(s);
						if(i>0) {
							System.out.println("inserted");
						}else {
							System.out.println("not insert");
						}
						
					}
					catch(Exception e) {
						e.printStackTrace();
					}
	}
	

}
