package com.company.locks_semaphores;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount2 {
	private int balance = 100;
	private final Lock lock = new ReentrantLock();

	public void withdraw(int amount) {

		System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
		try {
			//lock.lock();      same behaviour as synchronized
			if (lock.tryLock()) {
				if (balance >= amount) {
					System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
						Thread.currentThread().interrupt();     // good practice
					}finally {
						lock.unlock();
					}

					balance -= amount;
					System.out.println("Withdrawal Completed. Remaining balance " + amount);
				} else {
					System.out.println(Thread.currentThread().getName() + " Insufficient balance");
				}
			}else {
				System.out.println("Could not acquire the lock!!! will Try Again later...");
			}
		} catch (Exception e) {
			Thread.currentThread().interrupt();     // good practice
		}
		
		if(Thread.currentThread().isInterrupted()){
			System.out.println("Thread is interrupted...");
		}
	}
}
