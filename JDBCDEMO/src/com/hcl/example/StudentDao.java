package com.hcl.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class StudentDao {

	public static boolean insertStudent(Student stud) {
		
		boolean flag=false;
		try {
			
			Connection con=Database.createConnection();
			
			String sql="insert into student(studentName,studentPhone,studentCity) values(?,?,?)";
			
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, stud.getStudentName());
			ps.setString(2, stud.getStudentPhone());
			ps.setString(3, stud.getStudentCity());
			
			ps.executeUpdate();
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}

	
	public static boolean deleteStudent(int userId) {
		boolean flag=false;
		try {
			
			Connection con=Database.createConnection();
			
			String sql="delete from student where studentId=?";
			
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, userId);
			
			
			ps.executeUpdate();
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}


	public static void getStudentDetails() {
	
		try {
			
			Connection con=Database.createConnection();
			
			String sql="select * from student;";
			
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next()) {
				
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String phone=rs.getString(3);
				String city=rs.getString(4);
				
				System.out.println("ID= "+id);
				System.out.println("Name= "+name);
				System.out.println("Phone= "+phone);
				System.out.println("City= "+city);
				System.out.println("*********************************");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}


	public static boolean updateStudent(int userId, Student student) {
		boolean flag=false;
		try {
			
			Connection con=Database.createConnection();
			
			String sql="update student set studentName=?,studentPhone=?,studentCity=? where studentId=?";
			
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, student.getStudentName());
			ps.setString(2, student.getStudentPhone());
			ps.setString(3, student.getStudentCity());
			ps.setInt(4, userId);
			
			
			
			ps.executeUpdate();
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
}
