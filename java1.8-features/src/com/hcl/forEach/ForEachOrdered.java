package com.hcl.forEach;

import java.util.HashSet;
import java.util.Set;

public class ForEachOrdered {
public static void main(String[] args) {
	
	  Set<String> gamesList = new HashSet<String>();  
      gamesList.add("Football");  
      gamesList.add("Cricket");  
      gamesList.add("Chess");  
      gamesList.add("Hocky");  
      System.out.println("------------Iterating by passing lambda expression---------------");  
      gamesList.stream().forEachOrdered(games -> System.out.println(games));  
      System.out.println("------------Iterating by passing method reference---------------");  
      gamesList.stream().forEachOrdered(System.out::println);  
}
}
