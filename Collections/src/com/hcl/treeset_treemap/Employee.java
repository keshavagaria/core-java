package com.hcl.treeset_treemap;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

	private int age;
	private String name;
	
	
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}

    
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(name, other.name);
	}


	@Override
	public int compareTo(Employee o) {
		
		//return this.name.compareTo(o.name);
		//return this.age-o.age;     //ascending
		return o.age-this.age;       //descending
	}
	
	
}
