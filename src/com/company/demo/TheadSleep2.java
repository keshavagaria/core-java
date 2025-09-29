package com.company.demo;

public class TheadSleep2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
				
				// throws Exception in thread "main" java.lang.IllegalArgumentException: timeout value is negative
				//Thread.sleep(-500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
