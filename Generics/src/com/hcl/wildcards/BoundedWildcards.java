package com.hcl.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hcl.genericsCollections.Animal;
import com.hcl.genericsCollections.Cat;
import com.hcl.genericsCollections.Dog;

public class BoundedWildcards {

	public static void main(String[] args) {
		
		List<Cat> catList=new ArrayList<Cat>();
		catList.add(new Cat("Pussy"));
		catList.add(new Cat("Barbie"));
		catList.add(new Cat("Teena"));
		
		List<Dog> dogList=new ArrayList<Dog>();
		dogList.add(new Dog("Tommy"));
		dogList.add(new Dog("Feedo"));
		dogList.add(new Dog("Bulldog"));
		
		printAnimalsList(dogList);
		printAnimalsList(catList);
		
		List<? extends Number> intList = Arrays.asList(1,2,3,55,77);
		List<? extends Number> floatList = Arrays.asList(1.1,2.2,3.3,5.5,7.7);
		System.out.println(sum(intList));
		System.out.println(sum(floatList));
		
		List<? super Integer> intList2 = Arrays.asList(1,2,3,55,77);
		List<? super Integer> floatList2 = Arrays.asList(1.1,2.2,3.3,5.5,7.7);
		printNumbers(intList2);
		printNumbers(floatList2);
	}
	
	//Bounded Wildcards
	private static void printAnimalsList(List<? extends Animal> list) {
			System.out.println(list);
		}
	
	private static double sum(List<? extends Number> numbers) { // upper bound
			double sum = 0;
		for(Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}
	
	private static void printNumbers(List<? super Integer> numbers) { // lower bound
		
	for(Object number : numbers) {
		System.out.print(number+" ");
	}
	
}
}
