package com.hcl.map;

import java.util.HashMap;
import java.util.Map;


public class HashMapTest {
public static void main(String[] args) {
	
	Map<Integer,String> map=new HashMap<>();
	map.put(1, "vishal");
	map.put(1, "vishu");
	map.put(1, "Keshav");
	System.out.println("Map Size="+map.size());
	
	for(Map.Entry<Integer, String>m:map.entrySet())
	{
		
		System.out.println(m.getKey()+" "+m.getValue());
		
	}
	

	
	Map<Student,Integer> map3 = new HashMap<>();
	System.out.println("Student Hashmap:");
	
	
	// DOUBT
	Student s1=new Student(30, "Vishal");
	Student s2=new Student(30, "Vishal");
	Student s3=new Student(30, "Vishal");
	map3.put(s1, 5);
	map3.put(s2, 6);
	map3.put(s3, 7);
	System.out.println(s1.equals(s2)+" "+s2.equals(s3));
	System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
	map3.put(new Student(25, "Keshav"), 4);
	map3.put(new Student(21, "Singh"), 3);
	map3.put(new Student(18, "Agaria"), 1);
	
	map3.forEach((K,V)->System.out.println(K+" "+V));
	
}
}
