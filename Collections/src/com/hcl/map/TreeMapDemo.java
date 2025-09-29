package com.hcl.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	
	Map<Integer,String> map=new TreeMap<Integer, String>();
	map.put(5, "Ravi");
	map.put(4, "Queen");	
	map.put(3, "Prashant");
	map.put(2, "Owaish");
	//map.put(null, "Nitin");  // Runtime Exception -> java.lang.NullPointerException
	map.put(7, null);
	map.put(6, null);
	
	map.put(8, "Nitin");


	for(Map.Entry<Integer, String>m:map.entrySet())
	{
		//map.remove(3);                                        // java.util.ConcurrentModificationException
		System.out.print(m.getKey()+":"+m.getValue()+"   ");
	}	

	Map<Student,Integer> map3 = new TreeMap<>();
	System.out.println("Student Hashmap:");

	// java.lang.ClassCastException
	map3.put(new Student(30, "Vishal"), 5);
	map3.put(new Student(25, "Keshav"), 4);
	map3.put(new Student(21, "Singh"), 3);
	map3.put(new Student(18, "Agaria"), 1);

	map3.forEach((K,V)->System.out.println(K+" "+V));
}
}
