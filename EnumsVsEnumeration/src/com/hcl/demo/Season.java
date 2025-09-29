package com.hcl.demo;

public enum Season {
	
	SPRING("mild"),
    SUMMER("hot"),
    AUTUMN("cool"),
    WINTER("cold");

    private final String temperature;
    
	private Season(String temperature) {
		System.out.println("Custom constructor called");
         this.temperature = temperature;
     }

	 public String getTemperature() {
         return temperature;
     }
}
