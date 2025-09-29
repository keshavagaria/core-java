package com.hcl.naiveWay;

public class StringPrinter {

	String thingsToPrint;
	
	public StringPrinter(String thingsToPrint) {
		this.thingsToPrint=thingsToPrint;
	}
	
	public void show() {
		System.out.println(thingsToPrint);
	}
}
