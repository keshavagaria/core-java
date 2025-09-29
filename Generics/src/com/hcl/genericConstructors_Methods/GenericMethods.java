package com.hcl.genericConstructors_Methods;

import java.util.ArrayList;
import java.util.List;

import com.hcl.genericsCollections.Animal;
import com.hcl.genericsCollections.Cat;
import com.hcl.genericsCollections.Dog;

public class GenericMethods {
	
	
	public static void main(String[] args) {
		shout("Kid");
		shout(52);
		shout(true);
		shout(new Cat());
		shout2("Baby",false);
		System.out.println(shout3("Adult",true));
		
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(500);
		printList(intList);
		
		List<Animal> animalList=new ArrayList<>();
		animalList.add(new Cat());
		animalList.add(new Dog());
		printAnimalsList(animalList);
	}

	private static <T> void shout(T thingsToShout) {
		System.out.println(thingsToShout+"!!!!!!!!!!!!!!!!!");
	}
	
	private static <T,V> void shout2(T thingsToShout,V otherThingsToShout) {
		System.out.println(thingsToShout+"********");
		System.out.println(otherThingsToShout+"********");
		
	}
	// with return type T
	private static <T,V> T shout3(T thingsToShout,V otherThingsToShout) {
		System.out.println(thingsToShout+"********");
		System.out.println(otherThingsToShout+"********");
		return thingsToShout;
	}
	
	// WildCards
	private static void printList(List<?> myList) {
		System.out.println(myList);
	}
	
	// Bounded WildCards
	private static void printAnimalsList(List<? extends Animal> myList) {
			System.out.println(myList);
		}
}
