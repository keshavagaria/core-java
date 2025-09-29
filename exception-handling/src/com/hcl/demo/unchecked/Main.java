package com.hcl.demo.unchecked;

public class Main {
	
	static void divide(int a,int b) {
		if(b==0) {
			throw new DivideByZeroException("Division By Zero is not Allowed...");
		}
		
		System.out.println("Result :"+(a/b));
	}
	
	public static void main(String[] args) {
		
		try {
			divide(10,0);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("After Exception");
	}
}
