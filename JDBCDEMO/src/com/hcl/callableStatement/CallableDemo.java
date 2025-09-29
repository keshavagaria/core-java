package com.hcl.callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	

	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	Connection connection=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=demo",
			"vishal","system123#");
	
			
			CallableStatement stmt=connection.prepareCall("{call emp_details(?,?,?)}");
			//stmt.setInt(1,500);
			stmt.setString(1,"Raman");
			stmt.setString(2,"Male");
			stmt.setInt(3,4000);
			stmt.execute();
		
			connection.close();
			System.out.println("success");  

}
}
