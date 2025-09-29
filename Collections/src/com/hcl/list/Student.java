package com.hcl.list;

public class Student {
	
	private int age;
	private String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
	

}
