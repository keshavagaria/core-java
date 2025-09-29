package com.hcl.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

	static Connection con;
	public static Connection createConnection() {
		
		try {
				//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create connection
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="system";
			con=DriverManager.getConnection(url, username, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
}
