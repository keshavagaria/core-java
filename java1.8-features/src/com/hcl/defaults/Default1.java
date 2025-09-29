package com.hcl.defaults;


interface Sayable{
	
	default void say() {
		System.out.println("Saying somthing from Interface...");
	}
	void sayMore();
	
	
	// default with Object Class Method
	default int hashcode() {
		
		return 100;
	}
}

class Say implements Sayable{

	@Override
	public void sayMore() {
		System.out.println("Saying More");
		
	}
	
	@Override
	public void say() {
		System.out.println("Saying from Child Class");
	}
	
	// Overriding Object Class Method
	@Override
	public int hashcode() {
		
		return 200;
	}
}
public class Default1 {
public static void main(String[] args) {
	Say say=new Say();
	say.say();
	say.sayMore();
	System.out.println(say.hashcode());
}
}
