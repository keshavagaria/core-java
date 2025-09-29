package com.hcl.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("Welcome TO Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("PRESS 1. ADD STUDENT");
			System.out.println("PRESS 2. DELETE STUDENT");
			System.out.println("PRESS 3. RETRIEVE STUDENT");
			System.out.println("PRESS 4. UPDATE STUDENT");
			System.out.println("PRESS 5. EXIT APP");

			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {
				// ADD STUDENt

				System.out.println("Enter student name=");
				String name = br.readLine();

				System.out.println("Enter Student phone=");
				String phone = br.readLine();

				System.out.println("Enter Student city");
				String city = br.readLine();

				Student student = new Student(name, phone, city);
				// System.out.println(student.toString());

				boolean result = StudentDao.insertStudent(student);
				if (result) {
					System.out.println("Student added successfully");
				} else {
					System.out.println("Something went wrong please try again...");
				}

			} else if (choice == 2) {
				// DELETE STUDENT
				
				System.out.println("Enter Id to delete =");
				int userId=Integer.parseInt(br.readLine());
				
				boolean result=StudentDao.deleteStudent(userId);
				
				if(result) {
					System.out.println("Student Deleted Sucessfully");
				}else {
					System.out.println("Something went wrong please try again...");
				}
				
			} else if (choice == 3) {
				// FETCH STUDENT
				
				StudentDao.getStudentDetails();
			} else if (choice == 4) {
				// UPDATE STUDENT
				System.out.println("Enter id to update=");
				int userId=Integer.parseInt(br.readLine());
				
				System.out.println("Enter student name=");
				String name = br.readLine();

				System.out.println("Enter Student phone=");
				String phone = br.readLine();

				System.out.println("Enter Student city");
				String city = br.readLine();
				
				Student student = new Student(name, phone, city);
				
				boolean result=StudentDao.updateStudent(userId,student);
				if(result) {
					System.out.println("Student Updated Successfully");
				}else {
					System.out.println("Something went wrong please try again...");
				}
			} else if (choice == 5) {

				break;
			} else {

			}

		}
		System.out.println("Thank You for using the app... See you again");
	}
}
