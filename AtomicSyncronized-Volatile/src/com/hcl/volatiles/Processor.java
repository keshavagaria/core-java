 package com.hcl.volatiles;

import java.util.Scanner;

public class Processor extends Thread{

	private volatile boolean running=true;
	
	@Override
	public void run() {
		while(running) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		running=false;
	}
	
	
	public static void main(String[] args) {
		
		Processor p1=new Processor();
		p1.start();
		
		System.out.println("Press any Key");
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		
		p1.shutdown();
		
	}
}
