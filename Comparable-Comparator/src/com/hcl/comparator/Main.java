package com.hcl.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(35, "Raman"));
		list.add(new Employee(30, "Keshav"));
		list.add(new Employee(25, "Vishal"));
		
		System.out.println("Sorting by Age");
		Collections.sort(list,new AgeComparator());
		list.forEach(p->System.out.println(p));
		
		System.out.println("Sorting by NAme");
		Collections.sort(list,new NameComparator());
		list.forEach(p->System.out.println(p));
		
	}
}
