package com.hcl.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		
		List<String> movies=new ArrayList<String>();
		movies.add("Batman");
		movies.add("Iron Man");
		movies.add("Superman");
		movies.add("Hulk");
		
		//String[] arr=new String[5];
		String[] arrayMovies=movies.toArray(new String[movies.size()]);
		
		System.out.println("Printing arrays==="+Arrays.toString(arrayMovies));
		System.out.println("Printing List===="+movies);
		
	}
}
