package com.company.locks_semaphores;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Reentrant Monitor:
//Advantage :-
//It eliminates the possibility of single thread deadlocking
public class JavaExplicitReentrantLock {

	private final Lock lock = new ReentrantLock();

	public void outerMethod() {
		lock.lock();
		try {
			System.out.println("Outer method...");
			innerMethod();
		} finally {
			System.out.println("Releasing lock from outer");
			lock.unlock();
		}
	}

	private void innerMethod() {
		lock.lock();
		try {
			System.out.println("Inner Method...");
		} finally {
			System.out.println("Releasing lock from inner");
			lock.unlock();
		}

	}

	public static void main(String[] args) {

		JavaExplicitReentrantLock example = new JavaExplicitReentrantLock();
		example.outerMethod();
	}

}
