package com.hcl.prepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrepareStatementDemo {
public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	    Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",
	    			"root","system");
	    //CREATE
//	    PreparedStatement ps1= con.prepareStatement("insert into student values(?,?,?)");
//	    ps1.setInt(1, 646);
//	    ps1.setString(2, "Agent");
//	    ps1.setInt(3, 23);
//	    int status= ps1.executeUpdate();
//	    System.out.println(status);
	    
	    //RETRIEVE
//	    PreparedStatement ps2= con.prepareStatement("select * from student");
//	    ResultSet rs=ps2.executeQuery();
//	    while(rs.next()) {
//	    	
//	    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//	    }
	    
	    //UPDATE
//	    PreparedStatement ps3= con.prepareStatement("update student set age=? where id=?");
//	    ps3.setInt(1, 29);
//	    ps3.setInt(2, 101);
//	   
//	    int status= ps3.executeUpdate();
//	    System.out.println(status);
	    
	    
	    //DELETE
	    PreparedStatement ps4= con.prepareStatement("delete from student where id=?");
	    ps4.setInt(1, 420);
	    
	   
	    int status= ps4.executeUpdate();
	    System.out.println(status);
	    
	    con.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
