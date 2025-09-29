package com.company.sync_Cooperation;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerDemo {

	int capacity;
	Queue<Integer> queue = new LinkedList<Integer>();

	public ProducerConsumerDemo(int capacity) {
		super();
		this.capacity = capacity;
	}

	public synchronized void produce(int value) throws InterruptedException {
		while (queue.size() == capacity) {
			wait(); // wait until there is space in queue
		}
		queue.add(value);
		System.out.println("Produced " + value);
		notifyAll();
	}

	public synchronized int consume() throws InterruptedException {
		while (queue.isEmpty()) {
			wait(); // wait until there is an item to consume
		}
		int value = queue.poll();
		System.out.println("Consumed " + value);
		notifyAll();
		return capacity;
	}

	public static void main(String[] args) {

		ProducerConsumerDemo demo = new ProducerConsumerDemo(5);

		Thread producerThread = new Thread(() -> {

			try {
				for (int i = 0; i < 10; i++) {

					demo.produce(i);
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		});
		
		Thread consumerThread = new Thread(() -> {

			try {
				for (int i = 0; i < 10; i++) {
					demo.consume();
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
