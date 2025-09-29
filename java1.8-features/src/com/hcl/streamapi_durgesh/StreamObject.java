package com.hcl.streamapi_durgesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	
	public static void main(String[] args) {
		
		//Stream API -> Collections/Group of Objects/Arrays
		
		//1. empty
		 Stream<Object> stream=   Stream.empty();
		 System.out.println(stream);
		 stream.forEach(e->System.out.println(e));
		 
		 //2. Arrays
		 String names[]= {"Vishal","Ajeet","Aman","Rahul"};
		 Stream<String> namesStream= Stream.of(names);
		 namesStream.forEach(e->System.out.println(e));
		 
		 //3. Builder
		 Stream<Object> steamBuilder=Stream.builder().build();
		 
		 //4. 
		  IntStream intStream=   Arrays.stream(new int[] {2,4,6,8});
		  intStream.forEach(e->System.out.println(e));
		  
		  //5.
		  ArrayList<Integer> list2=new ArrayList<>();
			list2.add(11);
			list2.add(12);
			list2.add(13);
			list2.add(14);
			
			Stream<Integer> listStream=list2.stream();
			listStream.forEach(e->System.out.println(e));
	}
}
