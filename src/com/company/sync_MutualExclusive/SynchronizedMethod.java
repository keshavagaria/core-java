package com.company.sync_MutualExclusive;

class Table{
	
	synchronized  void printTable(int n) throws InterruptedException {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			Thread.sleep(500);
		}
	}
}

class MyThread1 extends Thread{
	
	Table t;

	public MyThread1(Table t) {
		super();
		this.t = t;
	}
	
	public void run() {
		try {
			t.printTable(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyThread2 extends Thread{
	
	Table t;

	public MyThread2(Table t) {
		super();
		this.t = t;
	}
	
	public void run() {
		try {
			t.printTable(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class SynchronizedMethod {
	public static void main(String[] args) {
		Table table=new Table();
		MyThread1 t1=new MyThread1(table);
		MyThread2 t2=new MyThread2(table);
		
		t1.start();
		t2.start();
		
		
		
	}

}
