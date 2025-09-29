package com.hcl.demo;


// Java is Pass By Value
public class Animal {

	int eyes;
	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.eyes=2;
		int limbs=4;
		
		System.out.println("Before Passing : "+animal.eyes+" "+limbs);
		changePrimitive(limbs);
		changeReference(animal);
		System.out.println("After Passing : "+animal.eyes+" "+limbs);
	}
	
	private static void changePrimitive(int value) {
		value=8;
	}
	
	private static void changeReference(Animal animal2) {
		animal2.eyes=1;
	}
}
