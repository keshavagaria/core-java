package com.hcl.demo;

//static variable and method can be used in abstract class
abstract class Test{
	
	static int i=500;
	static void test() {
		System.out.println("Tha value of i is="+i);
	}
}
public class Demo extends Test{

	public static void main(String[] args) {
		
		Demo demo=new Demo();
		demo.test();
		
		Test.test();
	}
}
