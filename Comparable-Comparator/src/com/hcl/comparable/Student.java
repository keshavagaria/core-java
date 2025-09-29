package com.hcl.comparable;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	
		
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}



//	@Override
//	public int compareTo(Student o) {
//		if(this.id==o.id) {
//			return 0;
//		}else if (this.id > o.id) {
//			return 1;
//		}else {
//			return -1;
//		}
//		
//	}
	

	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
	
	
}
