package com.hcl.demo;

class Parent{
	
	
	public void display1() {
		System.out.println("PArent Display1...");
	}
	
	public static void display2() {
		System.out.println("PArent Display2...");
	}
}

class Child extends Parent{
	
	
	
	@Override
	public void display1() {
		System.out.println("Child Display...");
	}
	
	// method hiding
	public static void display2() {
		System.out.println("Child Display2...");
	}
}
public class MethodHiding {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.display1();
		parent.display2();
		
		Child child = new Child();
		child.display1();
		child.display2();
	}
}
