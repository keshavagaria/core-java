package com.company.garbage_collector;

import java.io.IOException;

public class RuntimeClass {
	
	 public static void main(String[] args) throws IOException {
		
		 Runtime.getRuntime().exec("notepad");
		 
		 //shutdown system
		// Runtime.getRuntime().exec("shutdown -s -t 0"); 
		 
		 //restart system
		// Runtime.getRuntime().exec("shutdown -r -t 0"); 
		 
		 System.out.println(Runtime.getRuntime().availableProcessors());  
		 
		 Runtime r=Runtime.getRuntime();  
		 System.out.println("Total Memory: "+r.totalMemory());  
		 System.out.println("Free Memory: "+r.freeMemory());  
	}

}
