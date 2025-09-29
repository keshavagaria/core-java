package com.hcl.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
public static void main(String[] args) {
	
	Map<Integer, String> map=new LinkedHashMap<>();
	map.put(null, "how");
	map.put(5, "Hello");
	map.put(5,"How u doing");
	map.put(3,"Hi");
	map.put(1, "Hola");
	map.put(4, "Hey");
	map.put(2,"Heya");
	map.put(6,null);
	map.put(7, null);
	
	map.forEach((K,V)->System.out.print(K+" "+V+"\n"));
	
	System.out.println("\n");
	Iterator<Map.Entry<Integer, String>> itr=map.entrySet().iterator();
	while(itr.hasNext())
	{
		//map.remove(5);                                //java.util.ConcurrentModificationException
		//itr.remove();									//java.lang.IllegalStateException
		System.out.println(itr.next());
	}
}
}
