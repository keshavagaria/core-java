package com.hcl.demo.cyclic_barrier;

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {
	
	// Cyclic Barrier doesn't block the main thread unlike CountDownLatch
	// Wait for all the threads
	public static void main(String[] args) {
		
		int numberOfServices = 3;
		ExecutorService executorService =  Executors.newFixedThreadPool(numberOfServices);
		CyclicBarrier barrier = new CyclicBarrier(numberOfServices);
		executorService.submit(new DependentService(barrier));
		executorService.submit(new DependentService(barrier));
		executorService.submit(new DependentService(barrier));


		System.out.println("All Dependent Services Finished. Starting Main service...");
		executorService.shutdown();
	}

}

class DependentService implements Callable<String>{

	private final CyclicBarrier barrier;
	
	
	
	public DependentService(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	@Override
	public String call() throws Exception {
		try {
			System.out.println(Thread.currentThread().getName()+" service started...");
			Thread.sleep(2000);
		}finally {
			barrier.await();
		}
		return "ok";
	}
	
}
