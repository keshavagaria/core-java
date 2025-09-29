package com.company.demo;

public class Demo4 {

	public static void main(String[] args) {
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		System.out.println(s1.equals(s2));
		
		StringBuffer s3=new StringBuffer("Hola");
		StringBuffer s4=new StringBuffer("Hola");
		
		
		System.out.println(s3.equals(s4));
		
		StringBuilder s5=new StringBuilder("testing");
		StringBuilder s6=new StringBuilder("testing");
		
		System.out.println(s5.equals(s6));
		
	}
}
