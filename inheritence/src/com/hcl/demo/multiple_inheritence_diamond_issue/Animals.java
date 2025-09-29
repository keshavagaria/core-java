package com.hcl.demo.multiple_inheritence_diamond_issue;

public interface Animals {

	void noise();
	
	public default void  eat() {
		System.out.println("Animals Are Eating...");
	}
}
