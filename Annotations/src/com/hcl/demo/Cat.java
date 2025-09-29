package com.hcl.demo;

@VeryImportant
public class Cat {

	 int id;
	@ImportantString
	 String name;
	
	public Cat(String name) {
		super();
		this.name = name;
	}

	@RunImmediately(times=3)
	public void meow() {
		System.out.println("Moew...");
	}
	
	public void eat() {
		System.out.println("chap chap...");
	}
}
