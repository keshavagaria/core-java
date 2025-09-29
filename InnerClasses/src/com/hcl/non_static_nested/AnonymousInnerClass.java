package com.hcl.non_static_nested;

interface Sayable {
	void say();
}

abstract class Animal {

	abstract void eat();
}

public class AnonymousInnerClass {
	public static void main(String[] args) {

		Sayable sayable = new Sayable() {

			@Override
			public void say() {
				System.out.println("Saying");

			}
		};
		sayable.say();

		Animal animal = new Animal() {

			@Override
			void eat() {
				System.out.println("eating");

			}
		};
		animal.eat();
	}
}
