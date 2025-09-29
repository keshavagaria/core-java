package com.hcl.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterate {

	public static void main(String[] args) {
		
		Map<String,Integer> numbers=new HashMap<>();
		
		numbers.put("Ankit", 12345);
		numbers.put("Kartik", 54321);
		numbers.put("Rahul", 45454);
		numbers.put("Shankey", 98798);
		numbers.put(null, 111);
		numbers.put(null, 222);
		
		// 1. iterating over keys using keySet()
		Iterator<String> keys=   numbers.keySet().iterator();
		
		while(keys.hasNext()) {
			
			//System.out.println(keys.next());
			String key=keys.next();
			System.out.println(key+" "+numbers.get(key));
		}
		System.out.println();
		for(String keys2:numbers.keySet()) {
			
			//System.out.println(keys2);
			System.out.println(keys2+" "+numbers.get(keys2));
		}
		
		System.out.println();
		
		// 2. Iterating over values using values() method
		for(Integer values: numbers.values()) {
			System.out.println(values);
		}
		
		System.out.println();
		// 3. Iterating map using entrySet()
		Set<Map.Entry<String,Integer>> set=  numbers.entrySet();
		System.out.println(set);
		
		Iterator<Map.Entry<String, Integer>> itr= set.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 System.out.println();
		 Iterator<Map.Entry<String, Integer>> itr2=  numbers.entrySet().iterator();
		 while(itr2.hasNext()) {
			 System.out.println(itr2.next());
		 }
		 
		 System.out.println();
		 for(Map.Entry<String, Integer> map:numbers.entrySet()) {
			 
			 System.out.println(map);
		 }
		 
		 // 4. forEach() method
		 System.out.println();
		 numbers.forEach((K,V)->System.out.println(K+" "+V));
	}
}
