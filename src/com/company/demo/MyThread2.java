package com.company.demo;


//using runnable interface
 class Test2 implements Runnable{

	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("The value of current thread is "+i);
		}
		
	}
	
}
public class MyThread2{

	public static void main(String[] args) {
		
		Test2 test2=new Test2();
		Thread thread=new Thread(test2);
		thread.start();
	}

}
