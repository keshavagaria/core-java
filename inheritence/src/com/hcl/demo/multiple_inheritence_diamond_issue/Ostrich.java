package com.hcl.demo.multiple_inheritence_diamond_issue;

public class Ostrich implements Birds,Animals{

	@Override
	public void noise() {
		
		System.out.println("Ostrich making noise...");
		
	}

	@Override
	public void eat() {
		
		Animals.super.eat();
		Birds.super.eat();
		System.out.println("Ostrich is also eating");
	}
	
}
