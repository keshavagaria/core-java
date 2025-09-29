package com.example.strict_floating_point;

public class StrictFloat {

	// Strict FP mode enabled by default
	public static void main(String[] args) {
		
		double x = 0.1 + 0.2;
		System.out.println(x==0.3);
	}
}
