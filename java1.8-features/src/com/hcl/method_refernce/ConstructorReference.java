package com.hcl.method_refernce;

interface Messageable{
	
	Message getMessage(String msg);
}

class Message{
	
	public Message(String msg) {
		System.out.println("Method Reference via Constructor..."+msg);
	}
}
public class ConstructorReference {

	public static void main(String[] args) {
		Messageable m=Message::new;
		m.getMessage("Hola");
	}
}
