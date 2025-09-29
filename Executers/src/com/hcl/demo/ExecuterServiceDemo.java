package com.hcl.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecuterServiceDemo {

	public static void main(String[] args) throws InterruptedException {
		
		long start = System.currentTimeMillis();
		
	ExecutorService executorService = Executors.newFixedThreadPool(9);
			for(int i=1;i<=10;i++) {
				int finalI = i;
				
		Future<?> future = executorService.submit(
					()->{
						
						int fact = factorial(finalI);
						System.out.println(fact);
					}
				);
				
			}
			
		executorService.shutdown();
		executorService.awaitTermination(100, TimeUnit.SECONDS);
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
