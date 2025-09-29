package com.hcl.collectionsClass;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.id-o.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

}
