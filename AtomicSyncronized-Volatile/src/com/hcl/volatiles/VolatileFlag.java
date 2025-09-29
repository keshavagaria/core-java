package com.hcl.volatiles;


class SharedResource{
	
	private volatile boolean flag = false;
	 
	public void setFlagTrue() {
		
		flag = true;
		System.out.println("Flag is set to true by writer");
	}
	
	public void printIfTrue() {
		
		while(!flag) {
			
		}
		System.out.println("flag is true");
	}
}
public class VolatileFlag {
	
	public static void main(String[] args) {
		
		SharedResource resource = new SharedResource();
		
		Thread writerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					Thread.currentThread().interrupt();
				}
				resource.setFlagTrue();
			}
		});
		
		Thread readerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				resource.printIfTrue();
				
			}
		});
		
		writerThread.start();
		readerThread.start();
	}

}
