package com.hcl.demo.multiple_inheritence_diamond_issue;

public class Main {

	public static void main(String[] args) {
		
		//runtime polymorphism
		Animals animals= new Ostrich();
		animals.noise();
		animals.eat();
		
		System.out.println();
		
		Birds birds = new Ostrich();
		birds.noise();
		birds.eat();
		
		
	}
}
