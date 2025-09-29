package com.hcl.statics;


//NOTE: Interface static methods are not available for Child Class

interface Sayable{
	void say();
	static void show() {
		System.out.println("Showing from Interface");
	}
}

class Child implements Sayable{

	@Override
	public void say() {
		System.out.println("Saying From Child...");
		
	}
	
	
}
public class Static1 {
public static void main(String[] args) {
	
	Child child=new Child();
	child.say();
	Sayable.show();

	
}
}
