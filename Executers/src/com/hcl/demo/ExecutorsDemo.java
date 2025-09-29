package com.hcl.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorsDemo {

	public static void main(String[] args) {
		
	   ExecutorService executorService =  Executors.newFixedThreadPool(1);
	   ExecutorService executorService2 = Executors.newCachedThreadPool();
	   ExecutorService executorService3 = Executors.newSingleThreadExecutor();
	   ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
	}
}
