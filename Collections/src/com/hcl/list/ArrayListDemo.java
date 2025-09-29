package com.hcl.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	
	List<String> list=new ArrayList<>();
	list.add("Ravi");
	list.add("Amit");
	list.add("Vishal");
	list.add(null);
	list.add("Amit");
	list.add(null);
	
	for(String s:list)
	{
		//list.remove(1);               //  java.util.ConcurrentModificationException
		System.out.print(s+" ");
	}
	System.out.println("\n");
	
	for(int i=0;i<list.size();i++)
	{
		//list.remove(i);					// No java.util.ConcurrentModificationException
		System.out.print(list.get(i)+" ");
	}
	
	System.out.println("\n");

	Iterator<String> itr=list.iterator();
	while(itr.hasNext())
	{
		//list.remove(0);       //java.util.ConcurrentModificationException
		//itr.remove();       //java.lang.IllegalStateException
		System.out.print(itr.next()+" ");
	}
	
	System.out.println("\n");
	
	list.forEach(s->{System.out.print(s+" ");});
}
}                                                 																												
