package com.hcl.demo;

import java.util.Objects;

public class Student {

	private int rollNum;
	private String name;

	public Student(int rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}
	
	/*
	@Override
	public boolean equals(Object obj) {
		
		return false;
	}

	@Override
	public int hashCode() {
		return 111;
	}
	*/
	
	

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		return Objects.equals(name, other.name);
	}

}
