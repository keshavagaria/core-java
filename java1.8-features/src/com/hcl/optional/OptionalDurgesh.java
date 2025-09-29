package com.hcl.optional;

import java.util.Optional;

public class OptionalDurgesh {

	
	public static Optional<String> getName() {
		String name=null;
		return Optional.ofNullable(name);
	}
	public static void main(String[] args) {
		
		String s="My Name is Khan";
		
		//System.out.println(s.length());
		
//		if(s==null) {
//			System.out.println("this is null");
//		}
//		else {
//			System.out.println("Not Null");
//		}
		
		Optional<String>optional=  Optional.ofNullable(s);
		System.out.println(optional.get());
		System.out.println(optional.isPresent());
		System.out.println(optional.orElse("My Name is Vishal"));
		
		Optional<String> nameOptional=  getName();
		System.out.println(nameOptional.orElse("No Name"));
	}
}
