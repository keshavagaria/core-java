package com.hcl.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {

		int[] arr = {4,2,1,7,8};

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		Integer[] arr2 =  {4,2,1,7,8};

		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

		String[] str = {"zebra","grapes","apples","lemons"};

		System.out.println(Arrays.toString(str));
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));

		//List<int[]> list1 = Arrays.asList(arr);
		List<Integer> list2= Arrays.asList(arr2);
		List<String> list3 =Arrays.asList(str);

		System.out.println();
		//Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);
		System.out.println(list2);
		System.out.println(list3);

		// Sorting custom objects using Arrays.sort()
		Employee[] employees = new Employee[4];
		employees[0] = new Employee(105, "Ram");
		employees[1] = new Employee(104, "Aman");
		employees[2] = new Employee(103, "Sita");
		employees[3] = new Employee(102, "Tom");

		System.out.println();
		System.out.println(Arrays.toString(employees));
		Arrays.sort(employees);				//java.lang.ClassCastException
		 
		//List<Employee> emp = Arrays.asList(employees);
		//Collections.sort(emp);
		
	}
}
