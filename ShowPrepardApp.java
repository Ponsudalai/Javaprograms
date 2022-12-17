package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ShowPrepardApp {

	public static void main(String[] args) {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String un="root";
		String pass="root";
		String url="jdbc:mysql://localhost:3306/sudalai";
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try {
				Class.forName(driver);
				 conn=DriverManager.getConnection(url,un,pass);

					Scanner sc=new Scanner(System.in);
					System.out.println("Enter employee id");
					int id=sc.nextInt();
					
					String s="select * from emp where eid=?";
					 pst=conn.prepareStatement(s);
					 pst.setInt(1, id);
					 rs=pst.executeQuery();
					if(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
					}else {
						System.out.println("Employee not exists");
					}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
	}

}
