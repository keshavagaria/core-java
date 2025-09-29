package com.hcl.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedVSConcurrentMap {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
       // Hashtable<String, Integer> map = new Hashtable<>();                    
      // Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());
        Map<String, Integer> map = new ConcurrentHashMap<>();
       // Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);

        Runnable t1=()-> {
                for(Map.Entry<String,Integer> entry:map.entrySet()){
                    System.out.println(entry.getKey()+" "+entry.getValue());

                    try {
                        Thread.sleep(1000);
                  } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                }
        };
        Runnable t2=()->{
        	
        	   try {
                   Thread.sleep(1000);
             } catch (InterruptedException e) {
                  e.printStackTrace();
              }
        	   
            map.put("G", 7);
            map.put("H", 8);
            };


             new Thread(t2).start();
             new Thread(t1).start();
        long endTime = System.currentTimeMillis();
        System.out.println("Program took " +
                (endTime - startTime) + " ms") ;
        }

    }

