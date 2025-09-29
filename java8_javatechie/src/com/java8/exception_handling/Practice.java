package com.java8.exception_handling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Practice {

	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("44","373","123","xyz");
		List<Integer> list2 = Arrays.asList(1,2,0);
		
//		List<Integer> intList = list.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
//		intList.forEach(s -> System.out.print(s+" "));
//		
		
		list.forEach(s -> printList(s));
		list.forEach(Practice::printList);
		list.forEach(handleExceptionIfAny(s -> System.out.println(Integer.parseInt(s))));
		list.forEach(handleGenericException(s -> System.out.println(Integer.parseInt(s)),NumberFormatException.class));
		list2.forEach(handleGenericException(s -> System.out.println(10/s),ArithmeticException.class));
		
		
		
	
	}
	
	private static void printList(String s) {
		try {
			System.out.println(Integer.parseInt(s));
		}catch (Exception e) {
			System.out.println("Exception "+e.getMessage());
		}finally {
//			System.out.println("finally");
		}
	}
	
	private static Consumer<String> handleExceptionIfAny(Consumer<String> consumer){
		
		return obj -> {
			try {
				consumer.accept(obj);
			}catch (Exception e) {
				System.out.println("Exception "+e.getMessage());
			}
		};
	}
	
	private static <T,E extends Exception>  Consumer<T> handleGenericException(Consumer<T> consumer,
																				Class<E> exObjClass) {
		
		return obj -> {
			try {
				consumer.accept(obj);
			}catch (Exception e) {
				try {
					E exe = exObjClass.cast(e);
					System.out.println("Exception "+exe.getMessage());

				}catch(ClassCastException ce) {
					throw e;
				}
			}
		};
	}
}
