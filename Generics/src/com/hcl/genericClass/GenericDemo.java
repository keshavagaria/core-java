package com.hcl.genericClass;

public class GenericDemo {

	public static void main(String[] args) {
		
		Printer<Integer> printer=new Printer<>();
		printer.setThingsToPrint(500);
		System.out.println(printer.getThingsToPrint());
		
		Printer<String> printer2=new Printer<String>();
		printer2.setThingsToPrint("My Name is Vishal");
		System.out.println(printer2.getThingsToPrint());
		
		
		Pair<Integer, String> pair = new Pair<>(100, "Vishal");
		System.out.println(pair.getKey()+" "+pair.getValue());
		
		Pair<String, String> pair2 = new Pair<>("first", "Vishal");
		System.out.println(pair2.getKey()+" "+pair2.getValue());
	}
	
}
