package com.hcl.collectors;

public class Employee {

	private int id;
	private int age;
	private String name;
	
	
	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}


	public int getId() {
		return id;
	}


	public int getAge() {
		return age;
	}


	public String getName() {
		return name;
	}
	
	
	
}
