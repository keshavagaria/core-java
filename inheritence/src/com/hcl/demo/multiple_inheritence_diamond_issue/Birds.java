package com.hcl.demo.multiple_inheritence_diamond_issue;

public interface Birds {

	void noise();
	
	public default void eat() {
		System.out.println("Birds Are Eating...");
	}
}
