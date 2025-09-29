package com.hcl.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.hcl.treeset_treemap.Student;

public class LinkedListDemo {
public static void main(String[] args) {
	
	List<Integer> list=new LinkedList<>();
	list.add(10);
	list.add(20);
	list.add(50);
	list.add(7);
	list.add(null);
	list.add(7);
	list.add(null);

	

	for(Integer s:list)
	{
		//list.remove(0);                     //java.util.ConcurrentModificationException
		System.out.print(s+" ");
	}
	
	System.out.println();
	List<Student> list2 = new ArrayList<Student>();
	
	list2.add(new Student(304, "Raman"));
	list2.add(new Student(303, "Chaman"));
	list2.add(new Student(302, "Ankit"));
	list2.add(new Student(301, "Vikas"));
	
	for(Student s:list2)
	{
		//list2.remove(0);					//java.util.ConcurrentModificationException
		System.out.println(s+" ");
	}
	
}
}