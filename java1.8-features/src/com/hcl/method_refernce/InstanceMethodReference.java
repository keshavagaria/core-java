package com.hcl.method_refernce;

interface Printable{
	
	void print();
}
public class InstanceMethodReference {

	public void printSomething() {
		System.out.println("Printing from non-static method...");
	}
	public static void main(String[] args) {
		
		InstanceMethodReference imr=new InstanceMethodReference();
		Printable p=  imr::printSomething;
		p.print();
		
		InstanceMethodReference imr2=new InstanceMethodReference();
		Printable p2=  imr2::printSomething;
		p2.print();
		
	}
}
