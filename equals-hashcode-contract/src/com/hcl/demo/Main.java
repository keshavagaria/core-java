package com.hcl.demo;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		Employee e1=new Employee(101,"vishu");
		Employee e2=new Employee(101,"vishu");
		Employee e3=new Employee(101,"vishu");
		Employee e4=new Employee(102,"vishu");
		Employee e5=new Employee(101,"vishal");
	
		
		System.out.println("Shallow compare - "+(e1==e2));
		System.out.println("Deep Compare - "+(e1.equals(e2)));
		System.out.println(e1.hashCode()+" "+e2.hashCode()+" "+e3.hashCode());
		System.out.println(e1+" "+e2+" "+e3);
		
		HashMap<Employee, String> empMap=new HashMap<Employee, String>();
		
		empMap.put(e1, "employee 1");
		empMap.put(e2, "employee 2");
		empMap.put(e3, "employee 3");
		empMap.put(e4, "employee 4");
		empMap.put(e5, "employee 5");
		
		empMap.forEach((K,V)->System.out.println(K+" "+V));
		
		
		Student s1=new Student(111, "Aman");
		var s2=new Student(111, "Aman");
		var s3=new Student(111, "Aman");
		var s4=new Student(222, "Aman");
		var s5=new Student(111, "Ramesh");
		
		System.out.println("Shallow compare: "+(s1==s2));
		System.out.println("Deep Compare: "+(s1.equals(s2)));
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
		
		
		HashMap<Student, String> studMap=new HashMap<Student, String>();
		
		studMap.put(s1,"A");
		studMap.put(s2,"B");
		studMap.put(s3,"C");
		studMap.put(s4,"D");
		studMap.put(s5,"E");
		
		studMap.forEach((K,V)->System.out.println(K+" "+V));
		
		Geek geek1 = new Geek(1, "Geek 1");
		Geek geek2 = new Geek(2, "Geek 2");
		Geek geek3 = new Geek(1, "Geek 3");
		
		HashMap<Geek, String> geekMap = new HashMap<Geek, String>();
		
		geekMap.put(geek1, "A Grade");
		geekMap.put(geek2, "B Grade");
		
		
		geekMap.forEach((K,V)->System.out.println(K+" "+V));
		
		System.out.println(geekMap.get(geek3));
	}
}
