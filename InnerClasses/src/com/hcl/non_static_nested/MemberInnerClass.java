package com.hcl.non_static_nested;


class Outer{
	private int value=100;
	
	class Inner{
		private int i=5;
		public void display() {
			System.out.println("Inner Class "+i+" "+value);
		}
	}
	
	public void show() {
		System.out.println("Outer Class");
	}
}
public class MemberInnerClass {
public static void main(String[] args) {
	
	Outer outer=new Outer();
	outer.show();
	
	Outer.Inner inner=outer.new Inner();
	inner.display();
}
}
