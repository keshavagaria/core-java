package com.hcl.lambdas;

public class Lambdas5_Runnable {
    
	public static void main(String[] args) {
		
	//Thread Example without lambda  
	Runnable runnable=new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Thread 1 is running...");
			
		}
	};
	Thread thread=new Thread(runnable);
	thread.start();
	
	Runnable runnable2=()->System.out.println("Thread 2 is running...");
	Thread thread2=new Thread(runnable2);
	thread2.start();
	}
}
