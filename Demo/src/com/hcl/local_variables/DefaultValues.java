package com.hcl.local_variables;

public class DefaultValues {
	
	
	int i;
	String name;
	
	public static void main(String[] args) {
		
		int i=0;
		String name=null;
		
		System.out.println(i);
		System.out.println(name);
		
		DefaultValues defaultValues =  new DefaultValues();
		System.out.println(defaultValues.i);
		System.out.println(defaultValues.name);

	}
}
