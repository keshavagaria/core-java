package com.hcl.finalize;

public class FinalizeDemo {

	public static void main(String[] args) {
		
		FinalizeDemo demo=new FinalizeDemo();
		FinalizeDemo demo2=new FinalizeDemo();
		
		demo=null;
		demo2=null;
		System.gc();
		System.out.println("Exiting");
	}
	
	public void finalize() {
		System.out.println("Object is garbage collected");
	}
}
