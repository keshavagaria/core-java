package com.hcl.defaults;

interface Left{

	default void say() {
		System.out.println("Saying From Left...");
	}
}


interface Right{
	
	default void say() {
		System.out.println("Saying From Right...");
	}
}

class Child implements Left,Right{

	@Override
	public void say() {
		System.out.println("Overrriden in Child...");
		Left.super.say();
		Right.super.say();
	}


	
}
public class DiamondProblem {
public static void main(String[] args) {
	Child c=new Child();
	
	c.say();
	
}
}
