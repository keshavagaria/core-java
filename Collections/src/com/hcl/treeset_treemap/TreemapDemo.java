package com.hcl.treeset_treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {
		
		Map<String,String> map1 = new TreeMap<>();
		map1.put("Raman", "25");
		map1.put("Lovelesh", "20");
		map1.put("Puneet", "25");
		map1.put("Aman", "18");
		
		map1.forEach((K,V)->System.out.println(K+" "+V));
		
		Map<Integer,Integer> map2 = new TreeMap<>();
		map2.put(500, 5);
		map2.put(400, 4);
		map2.put(300, 3);
		map2.put(200, 2);
		
		map2.forEach((K,V)->System.out.println(K+" "+V));
		
		
		
		Map<Employee,Integer> map4 = new TreeMap<>();
		
		map4.put(new Employee(30, "Vishal"), 5);
		map4.put(new Employee(25, "Keshav"), 5);
		map4.put(new Employee(21, "Singh"), 5);
		map4.put(new Employee(18, "Agaria"), 5);
		map4.put(new Employee(18, "Agaria"), 6);
		map4.put(new Employee(18, "Agaria"), 7);

		
		System.out.println("Employee Treemap:");
		map4.forEach((K,V)->System.out.println(K+" "+V));
		
		
		
	}
}
