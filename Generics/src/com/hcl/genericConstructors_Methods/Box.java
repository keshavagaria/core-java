package com.hcl.genericConstructors_Methods;

public class Box {
	
	public <T extends Number> Box(T value) {
		System.out.println(value);
	}
	
	
	
	public static void main(String[] args) {
		
		Box box = new Box(563.56);
	}

}
