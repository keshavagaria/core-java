package com.hcl.method_refernce;


public class InstanceMethodReference2 {

	public void sprint() {
		System.out.println("ljlfjlsjdlfjlsjf");
	}
	public static void main(String[] args) {
		
		/*
		 * Runnable runnable=new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("Hello Universe...");
		 * 
		 * } };
		 */
		
		//Runnable runnable=() ->System.out.println("Hello Universe...");
		
		
		//Thread t1=new Thread(runnable);
		//Thread t1=new Thread(() ->System.out.println("Hello Universe..."));
		InstanceMethodReference2 obj=new InstanceMethodReference2();
		Runnable runnable=obj::sprint;
		Thread t1=new Thread(runnable);
		t1.start();
		
		Thread t2=new Thread(new InstanceMethodReference2()::sprint);
		t2.start();
	}
}
