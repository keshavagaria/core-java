package com.hcl.wildcards;

import java.util.ArrayList;
import java.util.List;

import com.hcl.genericsCollections.Animal;
import com.hcl.genericsCollections.Cat;
import com.hcl.genericsCollections.Dog;
// Wildcards -> (?)
// 1. Used in read only operations
// 2. Used in methods returning void 
public class Wildcards {

	public static void main(String[] args) {

		ArrayList<Integer> listInteger=new ArrayList<Integer>();
		listInteger.add(100);
		listInteger.add(200);
		listInteger.add(300);

		ArrayList<Integer> listInteger2=new ArrayList<Integer>();

		ArrayList<Boolean> booList=new ArrayList<Boolean>();
		booList.add(true);
		booList.add(false);
		booList.add(true);
		
		
		printList(listInteger);
		printList(booList);
		getFirstElement(listInteger);
		copyElements(listInteger, listInteger2);
		
		
		ArrayList<?> arrayList=new ArrayList<String>();
		System.out.println(arrayList.get(0));
		//arrayList.add("hello");

	}

	// Wildcards
	private static int printList(
								//List<Object> list
									List<?> list) {
		System.out.println(list);
		return 0;
	}

	
	
	/*
	// wildcard cant be used bcoz return type is not void
	private static <T> T getFirstElement(ArrayList<T> list) {
		
		return list.get(0);
	}

	
	// wildcard cant be used due to write operation
	private static <T> void copyElements(List<T> source, List<T> destination) {
		
		for( T items : source) {
			destination.add(items);
		}
		System.out.println("Source :"+source);
		System.out.println("Destination :"+destination);
		
	}
	*/
	
	private static void getFirstElement(ArrayList<?> list) {
		
		System.out.println(list.get(0));
	}
	
	private static  void copyElements(List<?> source, List<?> destination) {
		
		System.out.println("Source :"+source.get(0));
		System.out.println("Destination :"+destination);
		
	}
}
