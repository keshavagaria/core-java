package com.hcl.naiveWay;

public class DoublePrinter {

	Double thingsToPrint;
	
	public DoublePrinter(Double thingsToPrint) {
		this.thingsToPrint=thingsToPrint;
	}
	
	public void show() {
		System.out.println(thingsToPrint);
	}
}
