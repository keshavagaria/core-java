package com.company.demo;

public class DeadLock {

	public static void main(String[] args) {
		
		final String resource1="vishal";
		final String resource2="singh";
		
		Thread t1=new Thread() {
			
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: Locked Resource 1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				synchronized (resource2) {
					System.out.println("Thread 2: Locked Resource 2");
					}
					
				}
			};
		};
		
		
		Thread t2=new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2: Locked resource 2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (resource1) {
						System.out.println("Thread2: Locked resource 1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
