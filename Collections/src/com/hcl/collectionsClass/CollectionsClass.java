package com.hcl.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
		
		List<String> movies=new ArrayList<String>();
		movies.add("Batman");
		movies.add("Iron Man");
		movies.add("Superman");
		movies.add("Hulk");
		
		System.out.println("Initial list==="+movies);
		Collections.addAll(movies, "Doctor Strange","Top Gun");
		
		System.out.println("After adding "+movies);
		
		String arr[]= {"Avengers","Justice League"};
		
		Collections.addAll(movies, arr);
		
		System.out.println("Again after adding "+movies);
		
		System.out.println(Collections.min(movies));
		
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(12);
		nums.add(14);
		nums.add(16);
		
		System.out.println("Minimum number="+Collections.min(nums));
		System.out.println("Maximum number="+Collections.max(nums));
		
		
		
	}
}
