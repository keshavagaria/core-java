package com.company.locks_semaphores;

public class DealLockSingleThread {

	public static void main(String[] args) throws InterruptedException {
		
		Thread currentThread =  Thread.currentThread();
		
		currentThread.join();
		
	}
}
