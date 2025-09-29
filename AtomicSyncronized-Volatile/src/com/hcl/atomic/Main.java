package com.hcl.atomic;

public class Main {
public static void main(String[] args) {
	
	Sequence sequence=new Sequence();
	
	Worker worker1=new Worker(sequence);
	worker1.start();
	
	Worker worker2=new Worker(sequence);
	worker2.start();
	
}
}

class Worker extends Thread{
	
	Sequence sequence;

	public Worker(Sequence sequence) {
		super();
		this.sequence = sequence;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"===="+sequence.getNext());
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
