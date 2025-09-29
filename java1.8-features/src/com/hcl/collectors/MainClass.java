package com.hcl.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
	
	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(999, 35, "Vishal"));
		list.add(new Employee(888, 32, "Rakesh"));
		list.add(new Employee(777, 28, "Aman"));
		list.add(new Employee(666, 26, "Rakhi"));
		list.add(new Employee(555, 35, "Aakruti"));
		
		list.forEach((e)->System.out.println(e.getId()+" "+e.getAge()+" "+e.getName()));
		
		Map<Integer,List<Employee>>map=list.stream().collect(Collectors.groupingBy(e->e.getAge()));
		
		map.forEach((K,V)->System.out.println(K+" "+V));
	}

}
