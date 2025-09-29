package com.hcl.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
public static void main(String[] args) {
	
	Set<String> set=new HashSet<String>();
	set.add("Amit");
	set.add("Ravi");
	set.add(null);
	set.add("Rahul");
    set.add(null);

    for(String s:set)
    {
    	//set.remove("Amit");               // java.util.ConcurrentModificationException
    	System.out.print(s+" ");
    }
    
	
	Set<Student> set3 = new HashSet<Student>();
	set3.add(null);
	set3.add(new Student(304, "Raman"));
	set3.add(new Student(303, "Chaman"));
	set3.add(new Student(302, "Ankit"));
	set3.add(new Student(301, "Vikas"));
	set3.add(new Student(301, "Vikas"));
	set3.add(new Student(301, "Vikas"));
	set3.add(null);
	
	System.out.println("\nStudent Hashset -> ");
	set3.forEach(e->System.out.println(e));   // java.lang.ClassCastException
}
}