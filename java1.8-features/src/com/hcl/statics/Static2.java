 package com.hcl.statics;

//NOTE1: Interface static methods are not available for Child Class

interface Printable {
	void print();

	static void show() {
		System.out.println("Showing from Interface");
	}
}

class Child2 implements Printable {

	@Override
	public void print() {
		System.out.println("Printing From Child..");

	}

	//Not an Overriden Method
	public static void show() {
		System.out.println("Showing from Child");
	}
}

public class Static2 {

	public static void main(String[] args) {
		Child2 child2=new Child2();
		child2.print();
		Printable.show();
		Child2.show();
		
		
	}
}
