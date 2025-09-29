package com.hcl.nested_interface;

abstract class Playable{
	
	abstract void play();
	
	interface Walkable{   //By Default-Static
		void walk();
	}
}

class Run extends Playable implements Playable.Walkable{

	@Override
	public void walk() {
		System.out.println("Walking Inside");
		
	}

	@Override
	void play() {
		System.out.println("Playing Outside...");
		
	}
	
}
public class NestedInterface2 {
public static void main(String[] args) {
	
	Playable playable=new Run();
	playable.play();
	
	Playable.Walkable walkable=new Run();
	walkable.walk();
}
}
