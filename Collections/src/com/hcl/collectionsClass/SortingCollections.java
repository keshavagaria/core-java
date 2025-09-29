package com.hcl.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingCollections {
public static void main(String[] args) {
	
	//String Objects
	List<String> movies=new ArrayList<String>();
	movies.add("Batman");
	movies.add("Iron Man");
	movies.add("Superman");
	movies.add("Hulk");
	
	Collections.sort(movies);
	
	 Iterator<String>itr=  movies.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 
	 System.out.println("\n");
	 //Reverse Sort
	 Collections.sort(movies,Collections.reverseOrder());
	 System.out.println(movies);
	 
	 //Wrapper Class Objects
	 List<Integer> nums=new ArrayList<Integer>();
		nums.add(12);
		nums.add(14);
		nums.add(10);
		nums.add(16);
		
		Collections.sort(nums);
		System.out.println(nums);
		Collections.sort(nums,Collections.reverseOrder());
		System.out.println(nums);
		
	List<Employee> empList=new ArrayList<>();
	
	empList.add(new Employee(201, "vishu"));
	empList.add(new Employee(101, "vishal"));
	empList.add(new Employee(99, "keshav"));
	
	System.out.println("List:");
	//ascending
	Collections.sort(empList);
	System.out.println(empList);
	//descending
	Collections.sort(empList,Collections.reverseOrder());
	System.out.println(empList);
	
	HashSet<Employee> empHashSet=new HashSet<>();
	empHashSet.add(new Employee(201, "vishu"));
	empHashSet.add(new Employee(101, "vishal"));
	empHashSet.add(new Employee(99, "keshav"));
	
	TreeSet<Employee> empTreeSet = new TreeSet<Employee>(empHashSet);
		
		System.out.println("Set:");
		System.out.println(empHashSet);
		System.out.println(empTreeSet);
		
	HashMap<Employee, Integer> empHashMap=new HashMap<>();
	
		empHashMap.put(new Employee(201, "vishu"), 2);
		empHashMap.put(new Employee(101, "vishal"), 1);
		empHashMap.put(new Employee(99, "keshav"), 9);
	
		System.out.println("Map:");
		empHashMap.forEach((E,I)->System.out.print(E+" "+I));
	
		TreeMap<Employee, Integer> empTreeMap = new TreeMap<>(empHashMap);
		System.out.println();
		empTreeMap.forEach((E,I)->System.out.print(E+" "+I));
}
}
