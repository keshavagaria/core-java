package com.hcl.method_refernce;


interface Animal{
	void eat();
}
public class StaticMethodReference {
	
	public static void eatSomething()
	{
		System.out.println("The Animal IS Eating...");
	}
	
	public static void main(String[] args) {
		
		Animal animal=StaticMethodReference::eatSomething;
		animal.eat();
	}

}
