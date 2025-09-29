package com.hcl.genericsCollections;

public class Dog extends Animal{

	private String name;
	
	
	public Dog(String name) {
		this.name = name;
	}


	@Override
	public void sound() {
		System.out.println(name+" is doing Woof Woof...");
		
	}


	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
	

}
