package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
	
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String un="root";
	private static String up="root";
	private static String url="jdbc:mysql://localhost:3306/sudalai";
	private static Connection conn=null;
	public static Connection getConnection() {
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,un,up);
			if(conn==null) {
			
				System.out.println("Error in connection");
				System.exit(0);;
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	}


