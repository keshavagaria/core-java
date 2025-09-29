package com.hcl.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",
				"root","system");

		//CREATE
		//		Statement statement1=connection.createStatement();
		//		int status= statement1.executeUpdate("insert into student values(800,'John',45)");
		//		System.out.println(status);

		//RETRIEVE
		//		Statement statement2=connection.createStatement();
		//		ResultSet rs= statement2.executeQuery("select * from student");
		//
		//		while(rs.next()) {
		//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		//		}

		//UPDATE
//		Statement statement3=connection.createStatement();
//		int status= statement3.executeUpdate("update student set age=80 where id=103");
//		System.out.println(status);

		//DELETE
		Statement statement4=connection.createStatement();
		int status= statement4.executeUpdate("delete from student where id=646");
		System.out.println(status);
		connection.close(); 
	}
}
