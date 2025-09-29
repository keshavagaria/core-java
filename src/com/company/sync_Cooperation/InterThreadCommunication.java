package com.company.sync_Cooperation;

class Customer{
	
	int balance = 10000;
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw amount");
		
		if(this.balance < amount) {
			System.out.println("Less Balance... Wait for Deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.balance = this.balance-amount;
		System.out.println("WithDraw Completed balance remaining..."+balance);
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Going to Deposit");
		this.balance += amount;
		System.out.println("Deposit Completed");
		System.out.println("Updated Balance..."+balance);
		notify();
	}
}


	
public class InterThreadCommunication {
public static void main(String[] args) {
	
	Customer c=new Customer();
	Thread t1=new Thread() {
		public void run() {
			c.withdraw(15000);
		}
	};
	
	t1.start();
	
	Thread t2=new Thread() {
		public void run() {
			c.deposit(10000);
		}
	};
	
	t2.start();
}
}
