package com.hcl.demo.countdown_latch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
	/*
		ExecutorService executorService =  Executors.newFixedThreadPool(3);
		Future<String> future1 = executorService.submit(new DependentService());
		Future<String> future2 = executorService.submit(new DependentService());
		Future<String> future3 = executorService.submit(new DependentService());
		
		future1.get();
		future2.get();
		future3.get();
	*/
		
//		List<Future<String>> futures = Arrays.asList(future1,future2,future3);
//		executorService.invokeAll(futures);
		
		int numberOfServices = 3;
		ExecutorService executorService =  Executors.newFixedThreadPool(numberOfServices);
		CountDownLatch latch = new CountDownLatch(numberOfServices);
		executorService.submit(new DependentService(latch));
		executorService.submit(new DependentService(latch));
		executorService.submit(new DependentService(latch));
		
		latch.await();

		System.out.println("All Dependent Services Finished. Starting Main service...");
		executorService.shutdown();
	}

	
}

class DependentService implements Callable<String>{

	private final CountDownLatch latch;
	
	
	
	public DependentService(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public String call() throws Exception {
		try {
			System.out.println(Thread.currentThread().getName()+" service started...");
			Thread.sleep(2000);
		}finally {
			latch.countDown();
		}
		return "ok";
	}
	
}
