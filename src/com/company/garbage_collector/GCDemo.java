package com.company.garbage_collector;

public class GCDemo {
	
	public static void main(String[] args) {
		
		GCDemo demo = new GCDemo();
		GCDemo demo2 = new GCDemo();
		GCDemo demo3 = new GCDemo();
		GCDemo demo4 = new GCDemo();
		
		demo = null;
		demo2 = null;
		demo3 = demo4;
		
		new GCDemo();
		
		
		//System.gc();
		Runtime.getRuntime().gc();
		System.out.println("Main method");
	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("Object is garbage collected");
		super.finalize();
	}
}
