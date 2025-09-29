package com.hcl.lambdas;

@FunctionalInterface
interface Addable{
	
	int add(int a,int b);
}

public class Lambdas3_MultipleParam {
	public static void main(String[] args) {
		
		Addable addable=(a,b)->a+b;
		System.out.println(addable.add(10, 17));
		
		Addable addable2=(int a,int b)->a+b;
		System.out.println(addable2.add(20, 20));
		
		Addable addable3=(int a,int b) -> {
			return a+b;
			};
			
		System.out.println(addable3.add(50, 50));
		}
		
	
}
