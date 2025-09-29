package com.hcl.javatechie.consumer_predicate_supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MySupplier implements Supplier<String>{

	@Override
	public String get() {
		
		return "Hello Wolrd!!!";
	}

	public static void main(String[] args) {
		
		Supplier<String> supplier =new MySupplier();
		System.out.println(supplier.get());
		
		Supplier<String> supplier2 = ()-> "Hello Multiverse!!!";
		System.out.println(supplier2.get());
		
		List<String> list = Arrays.asList("A","B","C","D");
		//List<String> list = Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(supplier2));
		
	}
}
