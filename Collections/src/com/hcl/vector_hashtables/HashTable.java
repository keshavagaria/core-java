package com.hcl.vector_hashtables;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	
	public static void main(String[] args) {
		
		int initialCapacity = 20;  
        float loadFactor = 0.5f;
        
		Hashtable<String, Integer> names=new Hashtable<>();
		
		//names.put(null, 89);                   // java.lang.NullPointerException:
		names.put("Vishal", 1);
		names.put("Vishu", 2);
		names.put("Keshav", 3);
		names.put("Keshav", 4);
		//names.put("Aman", null);                 // java.lang.NullPointerException
		
		
		 for(Map.Entry<String, Integer> s:names.entrySet()){
		    	//names.remove("Keshav");                                  // java.util.ConcurrentModificationException
		    	System.out.println(s.getKey()+" "+s.getValue());
		    }
		
		System.out.println("\n"+names.size()+" "+names);
		names.forEach((K,V)->System.out.println(K+" "+V+" "));
	}
}
