package com.company.demo;

class Multi implements Runnable {

	private int threadNumber;

	public Multi(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " Thread Number " + threadNumber);

//			if(threadNumber==2) {
//				throw new RuntimeException();
//			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ThreadDemoJohn {
	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 3; i++) {
			Multi multi = new Multi(i);
			Thread t1 = new Thread(multi);

			t1.start();
			t1.join();
		}

		//throw new RuntimeException();
	}
}
