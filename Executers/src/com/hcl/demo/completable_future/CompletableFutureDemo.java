package com.hcl.demo.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<String> completableFuture =  CompletableFuture.supplyAsync(()->{
			
			try {
				Thread.sleep(1000);
				System.out.println("Worker Thread");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return "ok";
		}).thenApply(x -> x+" "+x);
		
		//completableFuture.thenApply(x -> x+" "+x);
		String str = completableFuture.get();
		System.out.println(str);
		
	CompletableFuture<String> completableFuture2 =  CompletableFuture.supplyAsync(()->{
			
			try {
				Thread.sleep(1000);
				System.out.println("Worker Thread");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return "ok";
		});
		
		
		CompletableFuture<Void> f = CompletableFuture.allOf(completableFuture,completableFuture2);
		//f.get();
		//f.join();
		System.out.println("Main Thread");
	}
}
