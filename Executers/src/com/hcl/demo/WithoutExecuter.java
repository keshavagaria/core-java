package com.hcl.demo;

public class WithoutExecuter {

	public static void main(String[] args) {
		
	long start = System.currentTimeMillis();
	
	Thread[] threads = new Thread[10];
		for(int i=1;i<=10;i++) {
			int finalI = i;
			threads[i-1] = new Thread( 
				()->{
					
					int fact = factorial(finalI);
					System.out.println(fact);
				}
			);
			threads[i-1].start();
		}
		
		for(Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	System.out.println("Time Taken: "+(System.currentTimeMillis()-start));
	
	}

	private static int factorial(int num) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int result=1;
		for(int i=1;i<=num;i++) {
			result = result * i;
		}
		return result;
	}
}
