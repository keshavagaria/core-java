package com.hcl.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleTest {

	
	String message = "Vishu";
	
	@Test
	public void printMessage() {
		System.out.println("Inside Print Method");
		assertEquals(message, "Vishu");
	}
	
	public static void main(String[] args) {
		SimpleTest simpleTest=new SimpleTest();
		simpleTest.printMessage();
		
	}
}
