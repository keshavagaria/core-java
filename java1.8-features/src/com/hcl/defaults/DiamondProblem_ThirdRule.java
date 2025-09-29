package com.hcl.defaults;

interface Lefty{

	
	default void say() {
		System.out.println("Saying From Lefty...");
	}
}

interface Righty{
	
	default void say() {
		System.out.println("Saying From Righty...");
	}
}

class Center{

	public void say() {
		System.out.println("Saying from Center...");
	
	}
}
class Child2 extends Center implements Lefty,Righty{

	@Override
	public void say() {
		System.out.println("Saying from Child...");
		super.say();
		Lefty.super.say();
		Righty.super.say();
	}
	
	
	
}
public class DiamondProblem_ThirdRule {
public static void main(String[] args) {
	
	Child2 child2=new Child2();
	child2.say();
	
}
}
