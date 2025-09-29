package com.hcl.genericsCollections;

public class Cat extends Animal{

	private String name;
	
	
	public Cat(String name) {
		this.name = name;
	}


	@Override
	public void sound() {
		System.out.println(name+ "is doing Meow Moeow!!!!!!");
		
	}


	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}

	
	
}
