package com.hcl.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	
	Set<String> set=new LinkedHashSet<String>();
	set.add(null);
	set.add("One");
	set.add("Four");
	set.add("Five");
	set.add("Five");
	set.add("Two");
	set.add(null);
	
	 for(String s:set)
	    {
	    	//set.remove("One");               // java.util.ConcurrentModificationException
	    	System.out.print(s+" ");
	    }
	    
	System.out.println();
	set.forEach(s->System.out.println(s));
}
}
