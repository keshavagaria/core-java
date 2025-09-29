package com.company.demo;


class UserThread extends Thread{
	
	public void run() {
		System.out.println("This is user Thread");
	}
}


public class ThreadOp {
	
	public static void main(String[] args) {
		
	System.out.println("Program is started");
	int x=5+9;
	System.out.println("The sum is "+x);
	Thread thread=Thread.currentThread();
	System.out.println("The Current Thread is "+thread.getName());
	
	//setName
	thread.setName("MyMain");
	//getName
	System.out.println("The New Name is "+thread.getName());
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	//getId
	System.out.println("Thread id is "+thread.getId());
	System.out.println("Program is ended");
	
	UserThread userThread=new UserThread();
	
	//starting user Thread
	userThread.start();
	}

}
