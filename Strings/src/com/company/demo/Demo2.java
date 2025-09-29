package com.company.demo;

public class Demo2 {
	
	public static void main(String[] args) {
		
		String name="Vishal";
		name.concat("Singh");
		addMoney(name, 5000);
	}
	
	private static void addMoney(String name,int amount) {
		
		System.out.println(name+" "+amount);
	}

}
