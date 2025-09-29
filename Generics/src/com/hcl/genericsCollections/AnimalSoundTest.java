package com.hcl.genericsCollections;

import java.util.ArrayList;

public class AnimalSoundTest {

	public static void main(String[] args) {
		
		ArrayList<Object> cats=new ArrayList<>();
		cats.add(new Cat("Pussy"));
		cats.add(new Dog("Tommy"));
		
		Cat myCat=(Cat)cats.get(0);
		Cat myCat2=(Cat)cats.get(1);
		myCat.sound();
	}
}
