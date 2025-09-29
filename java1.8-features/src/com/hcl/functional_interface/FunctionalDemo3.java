package com.hcl.functional_interface;

interface Walkable{
	
	default void  walk() {
		System.out.println("Walking...");
	}
}

@FunctionalInterface
interface Movable extends Walkable{
	
	void move();
}

class MovableChild implements Movable{

	@Override
	public void move() {
		System.out.println("Moving...");
		
	}
	
	
}

public class FunctionalDemo3 {
	
	public static void main(String[] args) {
		
		MovableChild child=new MovableChild();
		child.move();
		child.walk();
	}

}
