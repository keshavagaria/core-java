package com.hcl.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

//Concurrent Modification Exception can also occur in Single-Threaded-Environment
//Solution-
//Use iterator or CopyOnWriteArrayList
public class SingleThreadExample {

    public static void main(String[] args) {

        List<String> list=new CopyOnWriteArrayList<>();                        // fail-safe
        //List<String> list=new ArrayList<>();                                   //fail-fast
        //List<String> list = Collections.synchronizedList(new ArrayList<>());     //fail-fast
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        
        for(String str:list){
            //System.out.println(str);
            if(str.equals("three")){
                list.add("six");           //fail-fast -> java.util.ConcurrentModificationException
            }
            System.out.println(str);
        }
        
        Iterator<String> itr= list.iterator();        
        while(itr.hasNext()){
            
        	System.out.println(itr.next());
            	if(itr.next().equals("five")) {
            		list.add("six");    
            	}
            
        }
        
        //HashSet<Integer> set=new HashSet<Integer>();                        //fail-fast
       // Set<Integer> set=  Collections.synchronizedSet(new HashSet<>());    //fail-fast
       CopyOnWriteArraySet<Integer> set= new CopyOnWriteArraySet<>();        //fail-safe
        
        set.add(1);
        set.add(2);
        set.add(3);
        
       for(Integer i:set) {
    	   if(i.equals(3)) {
    		   set.add(5);
    	   }
    	   System.out.println(i);
       }

       	Iterator<Integer> setItr = set.iterator();
       	while(setItr.hasNext()) {
       		System.out.println(setItr.next());
       		if(setItr.next().equals(3)) {
     		   set.add(4);
     	   }
       	}
       	
        //HashMap<Integer,Integer> map=new HashMap<>();
        //Map<Integer, Integer> map=Collections.synchronizedMap(new HashMap<>());
        ConcurrentHashMap<Integer, Integer> map=new ConcurrentHashMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        
        for(Map.Entry<Integer, Integer>m: map.entrySet()) {
        	System.out.println(m.getKey()+" "+m.getValue());
        	if(m.getKey().equals(2)) {
        		map.put(5, 500);
        	}
        }
        
        System.out.println();
        Iterator<Integer> itrMap = map.keySet().iterator();
        while(itrMap.hasNext()) {
        	Integer key = itrMap.next();
        	System.out.println(key+" "+map.get(key));
        	if(key.equals(2))
        		map.put(4, 400);
        }
	
    }
}

