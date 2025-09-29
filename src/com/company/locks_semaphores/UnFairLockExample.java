package com.company.locks_semaphores;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnFairLockExample {

	final Lock unfairLock =  new ReentrantLock();

	public void accessResource() {
		unfairLock.lock();
		try {
			System.out.println(Thread.currentThread().getName()+ " acquired the lock.");
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}finally {
			System.out.println(Thread.currentThread().getName()+ " released the lock.");
			unfairLock.unlock();
			
		}
	}

	public static void main(String[] args) {

		UnFairLockExample example = new UnFairLockExample();

		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				example.accessResource();
			}
		};
		new Thread(task,"Thread-1").start();
		new Thread(task,"Thread-2").start();
		new Thread(task,"Thread-3").start();
	}
}
