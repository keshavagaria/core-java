package com.util.logging;

import java.util.logging.Logger;


class Dog{
	
	public void sound() {
		System.out.println("Woof Woof...");	
		
	}
}


public class LoggingDemo {

	private static final Logger LOGGER = Logger.getLogger(LoggingDemo.class.getName());
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		LOGGER.info("Logging Started");
		LOGGER.info("Creating Object using Class.forName()");
	      
		Dog myDog=	(Dog) Class.forName("com.util.logging.Dog").newInstance();
		myDog.sound();
		
		LOGGER.info("Logging Ended");
	}
}
