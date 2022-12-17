package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GetSingleRecord {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
		String un="root";
		String pass="root";
		String url="jdbc:mysql://localhost:3306/sudalai";
		@SuppressWarnings("unused")
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,un,pass);
			Scanner ps=new Scanner(System.in);
			System.out.println("Enter Employee Id");
			int id=ps.nextInt();
			
			String s="select*from emp where eid="+id;
			rs=st.executeQuery(s);
			if(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
				
			}else {
				System.out.println("Employee Not Exists");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
