package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MYSQLConnectionUtil {
	static Connection con=null;
	public static  Connection getConnection() {
		
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			

			String url="jdbc:mysql://localhost:3306/techmportal";
			String username="root";
			String password="root123";
			con=DriverManager.getConnection(url,username,password);
		}
	
		catch(Exception e){
			System.out.println(e);
		}
	   return con;
	}

}
	
