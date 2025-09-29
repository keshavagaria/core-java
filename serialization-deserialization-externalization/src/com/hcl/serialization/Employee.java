package com.hcl.serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private static String fatherName;
	private final String motherName="Maya";
	private transient String name;
	
	public static String getFatherName() {
		return fatherName;
	}
	public static void setFatherName(String fatherName) {
		Employee.fatherName = fatherName;
	}
	
	public String getMotherName() {
		return motherName;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
