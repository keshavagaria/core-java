package com.hcl.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		list.add(new Student(103,"Vishal"));
		list.add(new Student(102,"Ravi"));
		list.add(new Student(101,"Aman"));
		
		
		Collections.sort(list,Collections.reverseOrder());
		list.forEach(p->System.out.println(p));
	}
}
