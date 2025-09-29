package com.hcl.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		
		String[] movies= {"Doctor Strange","Top Gun","Batman","Dune"};
		System.out.println("Array===="+Arrays.toString(movies));
		
		//1. Converting array to list
		List<String> list=new ArrayList<String>();
		for(String movie:movies) {
			
			list.add(movie);
		}
		
		System.out.println("List==>"+list);
		
		// 2. 
		List<String> list2 = Arrays.asList(movies);
		System.out.println(list2);
	}
}
