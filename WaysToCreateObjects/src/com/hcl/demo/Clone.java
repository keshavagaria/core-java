package com.hcl.demo;

import java.util.logging.Logger;

class Cat implements Cloneable{
	
	private static final Logger LOGGER = Logger.getLogger(Cat.class.getName());
	
	public void sound() {
		LOGGER.info("Printing Meow Meow!!!");
		System.out.println("Meow Moew!!!");
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class Clone {
	
	private static final Logger LOGGER = Logger.getLogger(Clone.class.getName());

	public static void main(String[] args) throws CloneNotSupportedException {
		
		LOGGER.info("Logging Started");
		
		Cat c1=new Cat();
		c1.sound();
		Cat c2=(Cat) c1.clone();
		c2.sound();
		
		System.out.println(c1.equals(c2));
		System.out.println(c1==c2);
		
		LOGGER.info("Logging ended");
	}
}
