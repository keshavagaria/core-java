package com.hcl.genericsCollections;

import java.io.Serializable;

//Bounded Generics
public class AnimalPrinter<T extends Animal & Serializable>  {

	T thingsToPrint;
	//Cat thingsToPrint;
	//Dog thingsToPrint;
	
	public AnimalPrinter(T thingsToPrint) {
		this.thingsToPrint=thingsToPrint;
	}
	
	public void show() {
		thingsToPrint.sound();
		System.out.println(thingsToPrint);
	}
}
