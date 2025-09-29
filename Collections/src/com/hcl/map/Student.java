package com.hcl.map;

import java.util.Objects;

public final class Student{
	//implements Comparable<Student>{


	private final int age;
	private final String name;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
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
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	/*
	@Override
	public int compareTo(Student o) {
		
		return this.age-o.age;
	}
	*/

}
