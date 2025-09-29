package com.hcl.javatechie.consumer_predicate_supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Value is "+t);	
	}
	
	public static void main(String[] args) {
		
		Consumer<Integer> consumer = (t) -> System.out.println("Printing "+t);
		consumer.accept(90);
		
		MyConsumer myConsumer = new MyConsumer();
		myConsumer.acceptValue(45);
		
		List<Integer> list = Arrays.asList(1,3,5,7,9);
		
		list.forEach(consumer);
		System.out.println();
		list.forEach((t) -> System.out.println("Value is: "+t));
		
	}

	private void acceptValue(Integer i) {
		System.out.println("The Value is "+i);
	}
}
