package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetRecords {

	public static void main(String[] args) {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String un="root";
		String pass="root";
		String url="jdbc:mysql://localhost:3306/sudalai";
		
		
			
			try {
				Class.forName(driver);
				Connection conn=DriverManager.getConnection(url,un,pass);
				Statement st=conn.createStatement();
				
				String s="select*from emp";
				
				ResultSet rs=st.executeQuery(s);
				System.out.println("EID\tENAME\t  DEPTID");
				System.out.println("---------------------");
				
				while (rs.next()) {
					System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"  +rs.getString("deptid"));
				}
				
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}

}
