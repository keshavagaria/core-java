package com.hcl.demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterServiceDemo3 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Callable<Integer> callable1 = ()-> {
			System.out.println("Task 1");
			return 1;
		};
		Callable<Integer> callable2 = ()->{
			System.out.println("Task 2");
			return 2;
		};
		Callable<Integer> callable3 = ()-> {
			System.out.println("Task 3");
			return 3;
		};
		
		List<Callable<Integer>> list = Arrays.asList(callable1,callable2,callable3);
		List<Future<Integer>> futures =  executorService.invokeAll(list);
		
		for(Future<Integer> future : futures) {
			System.out.println(future.get());
		}
		executorService.shutdown();
		
		System.out.println("Hello from main()");
	}

}
