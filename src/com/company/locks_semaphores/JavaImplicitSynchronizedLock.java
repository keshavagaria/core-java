package com.company.locks_semaphores;

// Reentrant Monitor:
// According to Sun Microsystems, Java monitors are reentrant means java thread
// can reuse the same monitor for
// different synchronized methods if method is called from the method.
// Advantage :-
// It eliminates the possibility of single thread deadlocking
public class JavaImplicitSynchronizedLock {
	
	public synchronized void m() {
		n();
		System.out.println("I am m()...");
	}
	
	public synchronized void n() {
		System.out.println("I am n()...");
	}

	public static void main(String[] args) {
		
		JavaImplicitSynchronizedLock lock = new JavaImplicitSynchronizedLock();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				lock.m();
			};
		};
		
		t1.start();
	
	}
}
