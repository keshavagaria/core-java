package com.company.sync_MutualExclusive;

class Tabless{
	
	public static synchronized void printTable(int n) throws InterruptedException {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			Thread.sleep(500);
		}
	}
}

class SelfThread1 extends Thread{
	Tabless tabless;
	
	public SelfThread1(Tabless tabless) {
		super();
		this.tabless = tabless;
	}

	public void run() {
		try {
			tabless.printTable(3);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class SelfThread2 extends Thread{
	Tabless tabless;
	
	public SelfThread2(Tabless tabless) {
		super();
		this.tabless = tabless;
	}
	
	public void run() {
		try {
			tabless.printTable(10);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class SelfThread3 extends Thread{
	Tabless tabless;
	public SelfThread3(Tabless tabless) {
		super();
		this.tabless = tabless;
	}
	public void run() {
		try {
			tabless.printTable(11);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class SelfThread4 extends Thread{
	Tabless tabless;
	public SelfThread4(Tabless tabless) {
		super();
		this.tabless = tabless;
	}
	public void run() {
		try {
			tabless.printTable(100);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class StaticSync {
public static void main(String[] args) {
	
	Tabless table1=new Tabless();
	Tabless table2=new Tabless();
	
	SelfThread1 t1=new SelfThread1(table1);
	SelfThread2 t2=new SelfThread2(table1);
	SelfThread3 t3=new SelfThread3(table2);
	SelfThread4 t4=new SelfThread4(table2);
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}
