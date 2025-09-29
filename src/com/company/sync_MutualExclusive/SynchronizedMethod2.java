package com.company.sync_MutualExclusive;


class Counter{
	
	private int count = 0;
	
	public synchronized void increment() {
		count++;     // This is a non-atomic operation
		//System.out.println(count);
	}
	
	public int getCount() {
	
		return count;
	}
}
class MyThreadd1 extends Thread{
	
	private Counter counter;
	
	

	public MyThreadd1(Counter counter) {
		super();
		this.counter = counter;
	}



	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			counter.increment();
		}
	}
	
}

class MyThreadd2 extends Thread{
	
	private Counter counter;
	
	

	public MyThreadd2(Counter counter) {
		super();
		this.counter = counter;
	}



	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			counter.increment();
		}
	}
	
}
public class SynchronizedMethod2 {
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		
		MyThreadd1 t1 = new MyThreadd1(counter);
		MyThreadd2 t2 = new MyThreadd2(counter);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(counter.getCount());
	}

}
