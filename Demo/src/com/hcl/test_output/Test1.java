package com.hcl.test_output;

public class Test1 {

	Test1(int a,int b){
		
		System.out.println("int a="+a+" "+"int b="+b);
	}
	
	Test1(int a,float b){
		System.out.println("int a="+a+" "+"float b="+b);
	}
	
	public static void main(String[] args) {
		
		byte a=10;
		byte b=20;
		Test1 test1=new Test1(a, b);
	}
}
