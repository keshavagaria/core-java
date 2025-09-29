package com.company.locks_semaphores;

public class BankAccount {

	private int balance = 100;

	public synchronized void  withdraw(int amount) {
		
		System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+amount);
		if(balance >= amount) {
			System.out.println(Thread.currentThread().getName()+" proceeding with withdrawal");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println("Withdrawal Completed. Remaining balance "+amount);
		}else {
			
			System.out.println(Thread.currentThread().getName()+" Insufficient balance");
			
		}
	}
}
