package com.hcl.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetDemo {
	public static void main(String[] args) {
		
		
		TreeSet<String> set=new TreeSet<String>();
		set.add("Amit");
		set.add("Ravi");
		set.add("Ankit");
		//set.add(null);     //Runtime Exception -> java.lang.NullPointerException
		set.add("Anjali");



		for(String s:set){
			//set.remove("Amit");                    //java.util.ConcurrentModificationException
			System.out.println(s);
		}
		
		System.out.println();
		//Descending order
		Iterator itr = set.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		Set<Student> set3 = new TreeSet<Student>();
		
		set3.add(new Student(304, "Raman"));
		set3.add(new Student(303, "Chaman"));
		set3.add(new Student(302, "Ankit"));
		set3.add(new Student(301, "Vikas"));
		
		//Collections.sort(set3);
		set3.forEach(e->System.out.println(e));   // java.lang.ClassCastException -> if not implemented Comparable
	}
}