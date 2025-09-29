package com.hcl.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	//private int counter = 0;
	AtomicInteger counter = new AtomicInteger();
	
	public void increment() {
		counter.incrementAndGet();
	}
	
	public int getCounter() {
		return counter.get();
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		Counter vc = new Counter();
		
		Thread t1 = new Thread(()->{
			for(int i=0; i<1000; i++ ) {
				vc.increment();
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=0; i<1000; i++ ) {
				vc.increment();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(vc.getCounter());
	}
}
