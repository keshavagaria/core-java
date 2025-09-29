package com.hcl.demo;

public class RunnableTask implements Runnable{

	@Override
	public void run() {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
