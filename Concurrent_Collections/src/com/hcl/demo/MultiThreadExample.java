package com.hcl.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MultiThreadExample {


    public static void main(String[] args) {
        
    	List<String> list=new CopyOnWriteArrayList<>();
    	//List<String> list=new ArrayList<>();           // fail-fast
    	//List<String> list=Collections.synchronizedList(new ArrayList<>());  //fail-fast
        
    	list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        Runnable t1=()-> {
                //task1
            for(String str:list){
                System.out.println(str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        
        Runnable t2=()-> {
                //task2
        	
        	 try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
        	 
            list.add("six");
            list.add("seven");
            list.add("eight");

           
            };

            new Thread(t2).start();
            new Thread(t1).start();

        }
    }

