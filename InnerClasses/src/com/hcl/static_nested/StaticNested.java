package com.hcl.static_nested;


class Outer{
	private int i=100;
	static private int j=500;
	
	void a1() {
		System.out.println("Non-Static Outer Method");
	}
	static void a2() {
		System.out.println("Static Outer Method");
	}
	
	static class Inner{
		void display() {
			System.out.println("Static Inner "+j);
			a2();
		}
		
		
	}
}
public class StaticNested {
public static void main(String[] args) {
	
	Outer outer=new Outer();
	outer.a1();
	Outer.a2();
	System.out.println("\n");
	
	Outer.Inner inner=new Outer.Inner();
	inner.display();
	
	
}
}
