package com.company.locks_semaphores;

public class Main {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		BankAccount2 account2 = new BankAccount2();
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				account2.withdraw(50);
				
			}
		};
		
		new Thread(task,"Thread 1").start();
		new Thread(task,"Thread 2").start();
	}

}
