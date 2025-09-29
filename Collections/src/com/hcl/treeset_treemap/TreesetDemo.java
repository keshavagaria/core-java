package com.hcl.treeset_treemap;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		
		Set<String> set=new TreeSet<String>();
		set.add("Tom");
		set.add("Jackie");
		set.add("Keanu");
		set.add("Juaquin");
		
		//System.out.println(set);
		
		Set<Integer> set2=new TreeSet<Integer>();
		set2.add(500);
		set2.add(400);
		set2.add(300);
		set2.add(200);
		
		//System.out.println(set2);
		
		Set<Student> set3 = new TreeSet<Student>();
//		set3.add(new Student(304, "Raman"));
//		set3.add(new Student(303, "Chaman"));
//		set3.add(new Student(302, "Ankit"));
//		set3.add(new Student(301, "Vikas"));
		
		//Collections.sort(set3);
		//set3.forEach(e->System.out.println(e));   // java.lang.ClassCastException
		
		Set<Employee> set4 = new TreeSet<Employee>();
		set4.add(new Employee(304, "Raman"));
		set4.add(new Employee(303, "Chaman"));
		set4.add(new Employee(302, "Ankit"));
		set4.add(new Employee(301, "Vikas"));
		set4.add(new Employee(301, "Vicky"));
		
		//Collections.sort(set4);
		set4.forEach(e->System.out.println(e));
		
		
	}
}
