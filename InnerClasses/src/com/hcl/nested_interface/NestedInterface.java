package com.hcl.nested_interface;

interface Showable{
	void show();
	
	interface Printable{    // by default -public,static
		void print();
	}
	
}

class Baby implements Showable.Printable,Showable{

	@Override
	public void print() {
		System.out.println("Printing from inside");
		
	}

	@Override
	public void show() {
		System.out.println("Showing from outside");
		
	}
	
}
public class NestedInterface {

	public static void main(String[] args) {
		Showable showable=new Baby();
		showable.show();
		
		Showable.Printable printable=new Baby();
		printable.print();
	}
}
