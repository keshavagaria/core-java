package com.company.demo;

class ThreadJoinClass extends Thread{
	public void run() {
		for(int i=0;i<2;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("From Run Method "+Thread.currentThread().getName());
			System.out.println(i);
		}
	}
}
public class ThreadJoin {
	
	public static void main(String[] args) {
		
		ThreadJoinClass t1=new ThreadJoinClass();
		ThreadJoinClass t2=new ThreadJoinClass();
		ThreadJoinClass t3=new ThreadJoinClass();
		
		t1.start();
		
		
		
		try {
			System.out.println("From Main method "+Thread.currentThread().getName());
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		t2.start();
		
		try {
			System.out.println("From Main method "+Thread.currentThread().getName());
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		t3.start();
		System.out.println("Main Thread");
	}

}
