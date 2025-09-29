package com.hcl.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterServiceDemo2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService =  Executors.newSingleThreadExecutor();
		
		Future<Integer> future = executorService.submit(() -> 100);  // Callable
		 Future<?> future2 = executorService.submit(() -> System.out.println("hello")); //Runnable
		 
		 //Runnable runnable = ()-> "Hello";
		 Callable<String> callable = ()-> "Hello";
		
		 // Runnable with result
		 Future<?> future3 = executorService.submit(()->System.out.println("Hola"),"Success"); 
		 
		 System.out.println(future.get()); 
		 future2.get();
		 System.out.println(future3.get());
		 executorService.shutdown();
		
		System.out.println(executorService.isShutdown());
		Thread.sleep(100);
		System.out.println(executorService.isTerminated());
	}
}
