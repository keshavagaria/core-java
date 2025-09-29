package com.company.demo;


class Testing extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class ThreadJoin2 {

	public static void main(String[] args) {
		
		Testing t1=new Testing();
		Testing t2=new Testing();
		Testing t3=new Testing();
		
		t1.start();
		
		try {
			//t1.join();
			t1.join(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
	}
}
