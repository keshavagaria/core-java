package com.hcl.demo;

import java.util.logging.Logger;
import java.util.logging.LoggingMXBean;

class Dog{
	
	public void sound() {
		System.out.println("Woof Woof...");	
		
	}
}


public class ClassForNameNewInstance {
	
	private static final Logger LOGGER = Logger.getLogger(ClassForNameNewInstance.class.getName());
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	
		LOGGER.info("Logging Started");
		LOGGER.info("Creating Object using Class.forName()");
	      
		Dog myDog=	(Dog) Class.forName("com.hcl.demo.Dog").newInstance();
		myDog.sound();
		
		LOGGER.info("Logging Ended");
}	

}
