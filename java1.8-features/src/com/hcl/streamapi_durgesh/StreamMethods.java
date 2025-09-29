package com.hcl.streamapi_durgesh;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		
		//filter(Predicate)
		
		
		//map(Function)  ->Operation on each element
		
		//1. - filter the name starts with 'A'
		List<String> names=Arrays.asList("Aman","Ankit","Abhinav","Vishu");
		
		List<String> sorted=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		sorted.forEach(e->System.out.println(e));
		
		//2. Square using map
		List<Integer> numbers=Arrays.asList(2,5,9,8,100);
		List<Integer> squares=numbers.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(squares);
		
		//Method Reference
		names.stream().forEach(System.out::println);
		
		//sorting
		numbers.stream().sorted().forEach(System.out::println);
		
		//min
		Integer min=numbers.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Minimum "+min);
		
		//max
		Integer max=numbers.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Maximum Number="+max);
	}
}
