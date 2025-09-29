package com.company.sync_Cooperation;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {
	
	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);

		Thread producerThread = new Thread(() -> {

			try {
				for (int i = 0; i < 10; i++) {

					//queue.add(i); // throws exception if full
					queue.put(i); // blocks thread if full
					System.out.println("Produced :"+i);
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		});
		
		Thread consumerThread = new Thread(() -> {

			try {
				for (int i = 0; i < 10; i++) {
					//queue.poll(); // returns null if empty
					Integer value = queue.take();// blocks if empty
					System.out.println("Consumed :"+value);
					Thread.sleep(150);
				}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		});
		
		producerThread.start();
		consumerThread.start();
	}

}
