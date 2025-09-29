package com.hcl.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

final class Employee{
	
	private final int id;
	private final String name;
	
	public Employee(int id, String name) {
	
		this.id = id;
		this.name = name;
	}

	
	public int getId() {
		return id;
	}


//	public void setId(int id) {
//		this.id = id;
//	}


	public String getName() {
		return name;
	}


//	public void setName(String name) {
//		this.name = name;
//	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
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
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
}
public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Aman");
		Employee e2 = new Employee(101, "Aman");
		Employee e3 = new Employee(101, "Aman");
		
		Map<Employee,String> map = new HashMap<>();
		map.put(e1, "employee 1");
		map.put(e2, "employee 2");
		map.put(e3, "employee 3");
		
		map.forEach((k,v)->System.out.println(k+" "+v));
		System.out.println(map.get(e1)+" "+map.get(e2)+" "+map.get(e3));

//		e1.setId(202);
//		e1.setName("Vishu");
		
		System.out.println(map.get(e1)+" "+map.get(e2)+" "+map.get(e3));
	}
}
