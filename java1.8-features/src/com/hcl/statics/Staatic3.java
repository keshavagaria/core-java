package com.hcl.statics;

interface Main{
	
	public static void main(String[] args) {
		System.out.println("Main Method from Interface");
	}
}
public class Staatic3 implements Main{

	public static void main(String[] args) {
		System.out.println("Normal Main() method");
		Main.main(args);
	}

}