package com.hcl.koushik;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
		Greeter greeter=new Greeter();
		Greetingimpl greetingimpl=new Greetingimpl();
		greeter.greet(greetingimpl);
	}
}
