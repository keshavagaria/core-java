package com.company.demo;

class Twice2 extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadTwice2 {

	public static void main(String[] args) {
		Twice2 twice2=new Twice2();
		twice2.run();
		twice2.run();
		
	}
}
