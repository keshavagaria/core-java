package com.hcl.method_refernce;


public class StaticMethodReference2 {
	
	public static void runn() {
		System.out.println("Thread is Running");
	}
	public static void main(String[] args) {
		
		/*
		 * Runnable runnable=new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("hola");
		 * 
		 * } };
		 */
		//Runnable runnable=() ->System.out.println("hola");
				
		//Thread t1=new Thread(() ->System.out.println("hola"));
		//Thread t1=new Thread(runnable);
		
		Runnable runnable=StaticMethodReference2::runn;
		Thread t1=new Thread(runnable);
		t1.start();
		
		Thread t2=new Thread(StaticMethodReference2::runn);
		t2.start();
		
	}
}
