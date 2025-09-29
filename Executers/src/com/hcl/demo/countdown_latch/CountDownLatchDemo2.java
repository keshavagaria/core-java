package com.hcl.demo.countdown_latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

public class CountDownLatchDemo2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		int numberOfServices = 3;
		CountDownLatch latch = new CountDownLatch(numberOfServices);
		for(int i=0;i<numberOfServices;i++) {
			new Thread(new DependentService2(latch)).start();
		}
		
		latch.await();

		System.out.println("All Dependent Services Finished. Starting Main service...");
		
	}
}

class DependentService2 implements Runnable{

	private final CountDownLatch latch;
	
	
	
	public DependentService2(CountDownLatch latch) {
		this.latch = latch;
	}


	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" service started...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			latch.countDown();
		}
		
	}
	
}
