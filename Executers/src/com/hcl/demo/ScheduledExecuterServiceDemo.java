package com.hcl.demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecuterServiceDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
	
	ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	//scheduler.schedule(() -> System.out.println("task executed after 5 second delay"),
	//							5, TimeUnit.SECONDS);
	
	scheduler.scheduleAtFixedRate(() -> 
				System.out.println("task executed after 5 second delay"),
				5,5, TimeUnit.SECONDS);
	
	/*
	ScheduledFuture<?> scheduledFuture = scheduler.scheduleWithFixedDelay(() ->
			System.out.println("task executed after 5 second delay"),
			5,5, TimeUnit.SECONDS);
	
	scheduledFuture.get();
	*/
	
	
	scheduler.schedule(()->{
		System.out.println("Initiating shutdown");
		scheduler.shutdown();
		}
	,20, TimeUnit.SECONDS
	);
	
	
	//scheduler.shutdown();
	}

}
