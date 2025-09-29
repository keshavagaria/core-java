package com.hcl.javatechie.consumer_predicate_supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		System.out.println("test method of predicate");
		return t%2==0;
	}
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (t) -> t%2 == 0;
			
			System.out.println(predicate.test(90));
			System.out.println(predicate.test(45));
			
			List<Integer> list = Arrays.asList(1,2,3,4,5,7,9);
			
			list.stream().filter(predicate).forEach(t -> System.out.println("printing Evens: "+t));
			System.out.println();
			list.stream().filter(t -> t%2 == 0).forEach(t -> System.out.println("printing Evens: "+t));
			
		
		
	}

	
}
