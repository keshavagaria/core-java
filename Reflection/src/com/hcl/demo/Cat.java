package com.hcl.demo;

public class Cat {
	
	private final String name;
	private int age;
	
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void meow() {
		System.out.println("MEowwww!!!");
	}
	
	private void heyThisisPrivate() {
		System.out.println("How did u call this method");
	}
	
	public static void iAmPublicStaticMethod() {
		System.out.println("Hey I am public and static");
	}
}
