package com.hcl.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();

		
		map.put(3, "Ankit");
		map.put(4, "Ravi");
		map.put(1, "Vishal");
		map.put(2, "Amit");
		map.put(5, "Kunal");
		map.put(5, "Keshav");
		map.put(null, "KumKum");
		map.put(null, "Kavita");
		map.put(6, null);
		map.put(7, null);

		Iterator<Map.Entry<Integer, String>> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			//map.remove(1);                                      // java.util.ConcurrentModificationException
			System.out.print(itr.next()+"  ");
			
		}
		System.out.println("\n");
		for(Map.Entry<Integer,String> m:map.entrySet())
		{
			//map.remove(1);                                       // java.util.ConcurrentModificationException
			System.out.print(m.getKey()+":"+m.getValue()+"   ");
		}


		System.out.println("\n");
		map.forEach((K,V)->System.out.print(K+":"+V+"  "));
	}
}
