
package com.hcl.atomic;

public class Sequence {

	//	AtomicInteger value=new AtomicInteger(0);
	//	public AtomicInteger getNext() {
	//			value.incrementAndGet();
	//			return value;
	//		
	//	}

	private int value=0;

	public int getNext() {
		synchronized (this) {

			value++;
			return value;
		}
	}
}


