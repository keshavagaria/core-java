package com.company.demo;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		
		ThreadGroup tg1 = new ThreadGroup("Group A");
		
		Thread t1 =new Thread(tg1, new MyRunnable(),"one");
		Thread t2 =new Thread(tg1, new MyRunnable(),"two");
		Thread t3 =new Thread(tg1, new MyRunnable(),"three");
		
		
	}
}


class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello");
		
	}
	
}
