package com.company.syncCollections;

public class ThreadSafetyWithCollections {

	public static void main(String[] args) throws InterruptedException {
		
		InventoryManager manager=new InventoryManager();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.populateSoldProduct();
				
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.displaySoldProducts();
				
			}
		});
		
		t1.start();
		Thread.sleep(200);
		//t1.join();
		t2.start();
		
		
		
	}
}
