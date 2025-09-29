package com.hcl.demo;

public class Test implements Demo1{

	@Override
	public void show() {
		System.out.println("I am Showing");
		
	}

	@Override
	public String say() {
		System.out.println("Inside String method");
		return "Hi i am a String method";
	}

	@Override
	public int value() {
		System.out.println("Inside int type method");
		return 69;
	}

	
}
