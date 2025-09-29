package com.hcl.demo.checked;

public class Main {

	static void validateAge(int age) throws InvalidAgeException {
		if(age < 18) {
		
			throw new InvalidAgeException("Age is Under 18!!! Not Eligible");
		}
			
			System.out.println("Eligible to vote");
	
	}
	
	public static void main(String[] args) {
	
		try {
			
			System.out.println("Custom Exception testing");
			throw new CustomCheckedException("This is custom checked exception");
		}catch (CustomCheckedException e) {
			System.out.println("Handled Gracefully..."+e.getMessage());
		}
		
		
		try {
			validateAge(12);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
		System.out.println("After Exceptions");
	}
	
}
