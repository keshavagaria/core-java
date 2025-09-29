package com.company.sync_MutualExclusive;

class Tables{
	
	public void printTable(int n) throws InterruptedException {
		synchronized (this) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			Thread.sleep(500);
		}
	}
	}
}

class MineThread1 extends Thread{
	
	Tables t;

	public MineThread1(Tables t) {
		super();
		this.t = t;
	}
	
	public void run() {
		try {
			t.printTable(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MineThread2 extends Thread{
	
	Tables t;

	public MineThread2(Tables t) {
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
public class SyncronizedBlock {
public static void main(String[] args) {
	
	Tables tables=new Tables();
	MineThread1 t1=new MineThread1(tables);
	MineThread2 t2=new MineThread2(tables);
	
	t1.start();
	t2.start();
	
}
}
