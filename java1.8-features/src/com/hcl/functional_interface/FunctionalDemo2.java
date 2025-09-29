package com.hcl.functional_interface;

@FunctionalInterface
interface Doable{
	void doSomething(String msg);   //SAM-Single Abstract Method
	
	 // It can contain any number of Object class methods.  
	int hashCode();
	String toString();
	boolean equals(Object obj);
}

class DoableChild implements Doable{

	@Override
	public void doSomething(String msg) {
		System.out.println("Doing..."+msg);
		
	}

	
}

public class FunctionalDemo2 {
public static void main(String[] args) {
	
	DoableChild child=new DoableChild();
	child.doSomething("Streching");
	
}
}
