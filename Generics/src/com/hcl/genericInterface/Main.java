package com.hcl.genericInterface;

public class Main {

	public static void main(String[] args) {
		
		StringContainer container1 = new StringContainer();
		container1.add("String Container");
		System.out.println(container1.get());
		
		IntegerContainer container2 = new IntegerContainer();
		container2.add(1000);
		System.out.println(container2.get());
		
		//
		GenericContainer<String> container3 = new GenericContainer<String>();
		container3.add("Generic String Container");
		System.out.println(container3.get());
		
		GenericContainer<Integer> container4 = new GenericContainer<>();
		container4.add(420);
		System.out.println(container4.get());
	}
}
