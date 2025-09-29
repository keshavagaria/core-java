package com.hcl.functional_interface;

@FunctionalInterface
interface Sayable{
	void say(String msg);   //SAM-Single Abstract Method
}

class SayableChild implements Sayable{

	@Override
	public void say(String msg) {
		System.out.println("Saying "+msg);
		
	}
	
}

public class FunctionalDemo1 {

	public static void main(String[] args) {
		SayableChild child=new SayableChild();
		child.say("Poem");
		
	}
}
