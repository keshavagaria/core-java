package com.hcl.boundedTypeParameters;

public class Main {

	
	public static void main(String[] args) {
		
		Box<Number> box = new Box<>();
		box.setValue(50089898L);
		System.out.println(box.getValue());
	}
}
