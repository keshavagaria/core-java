package com.hcl.javatechie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorLambda {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee(101, "Vishal","IT",1000),
				new Employee(102, "Rahul","MEDICAL",2000),
				new Employee(103, "Keanu","Weather",3000),
				new Employee(104, "Tom","LEGAL",3500)
				);
		
		
/*	
 Collections.sort(empList , new Comparator<Employee>() {
 

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
		
	});
	
	Collections.sort(empList , new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			if(e1.getId()==e2.getId())
				return 0;
			else if(e1.getId()>e2.getId()) 
				return 1;
			else
				return -1;
		}
		
	});
	*/
	System.out.println("Sorting based on name");
	Collections.sort(empList , (e1, e2)->  e1.getName().compareTo(e2.getName()));
	
	for(Employee e : empList) {
		System.out.println(e);
	}
	
	System.out.println("Sorting based on id");
	Collections.sort(empList , (e1, e2) ->{
			if(e1.getId()==e2.getId())
				return 0;
			else if(e1.getId()>e2.getId()) 
				return 1;
			else
				return -1;
		});
	
	for(Employee e : empList) {
		System.out.println(e);
	}
	}
}
