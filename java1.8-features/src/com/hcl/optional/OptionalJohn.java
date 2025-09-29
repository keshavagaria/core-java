package com.hcl.optional;

import java.util.Optional;

public class OptionalJohn {

	public static void main(String[] args) {
		
		//Old Way
		//Cat myCat = findCatByName("Pussy");
		//System.out.println(myCat.getAge());   // if null->NullPointerException
		
		
//		if(myCat != null) {
//			System.out.println(myCat.getAge());
//		}else {
//			System.out.println(0);
//		}
		
		// Optional Way
		Optional<Cat> optionalCat = findCatByName("Pussy");
		
		//System.out.println(optionalCat.get().getAge()); //if null -> NoSuchElementException
		
		if(optionalCat.isPresent()) {
			System.out.println(optionalCat.get().getAge());
		}else {
			System.out.println(0);
		}
		
		Cat cat=optionalCat.orElse(new Cat("UNKNOWN", 12));
		System.out.println(cat.getName()+" "+cat.getAge());
		
		//optionalCat.get() <=> optionalCat.orElseThrow()
		
		int catAge=optionalCat.map(Cat::getAge)
					.orElse(5);
		System.out.println(catAge);
	}
	
//	private static Cat findCatByName(String name) {
//		Cat cat=new Cat(name, 2);
//		return null;
//		return cat;
//	}
	
	private static Optional<Cat> findCatByName(String name) {
		Cat cat=new Cat(name, 2);
		return Optional.ofNullable(null);
		//return Optional.ofNullable(cat);
	}
}
