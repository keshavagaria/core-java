package com.hcl.demo;

public class Main {

	public static void main(String[] args) {
		
		Test test=new Test();
		test.show();
		test.say();
		
		String saying=test.say();
		System.out.println(saying);
		test.value();
		
		int val=test.value();
		System.out.println(val);
	}
}
