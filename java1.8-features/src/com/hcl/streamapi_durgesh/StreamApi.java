package com.hcl.streamapi_durgesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		
		//create a list and filter all even numbers
		
		//different ways to create list
		/*
		 * List<Integer> list1=List.of(12,23,56,99,45); //Immutable list list1.add(44);
		 * 
		 * System.out.println(list1);
		 */
			
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list2.add(14);
		
		
		 List<Integer>list3=  Arrays.asList(12,23,56,99,45);     //Immutable list
		 //list3.add(78);    //not allowed   -> java.lang.UnsupportedOperationException
		 
		 //without stream
		 System.out.println("Without Streams Even Numbers");
		 List<Integer> list4=new ArrayList<>();
		 for(Integer i:list3) {
			 
			 if(i%2==0) {
				 list4.add(i);
			 }
		 }
		 System.out.println(list3);
		 System.out.println(list4);
		 
		 System.out.println();
		 System.out.println("Using Streams Even Numbers");
		//using stream
		Stream<Integer> stream= list3.stream();
		List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		//more precise
		List<Integer> newEvenList=list3.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newEvenList);
		
		//nos. greater than 50
		List<Integer> newList2=list3.stream().filter(i->i>50).collect(Collectors.toList());
		System.out.println("Numbers Greater Than 50==>"+newList2);
	}
}
