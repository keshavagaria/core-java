package com.hcl.static_nested;

class Outer2{
	private int i=100;
	static private int j=500;
	
	void a1() {
		System.out.println("Non-Static Outer Method");
	}
	static void a2() {
		System.out.println("Static Outer Method");
	}
	
	static class Inner2{
		static void display() {
			System.out.println("Static Inner "+j);
			a2();
		}
		
		
	}
}
public class StaticNested2 {
public static void main(String[] args) {
	Outer2 outer2=new Outer2();
	outer2.a1();
	Outer2.a2();
	System.out.println("\n");
	Outer2.Inner2.display();
}
}
