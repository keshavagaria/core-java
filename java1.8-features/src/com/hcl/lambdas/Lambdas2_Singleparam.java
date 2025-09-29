package com.hcl.lambdas;

@FunctionalInterface    //optional
interface Flammable{
	
	String flame(String msg);
}

public class Lambdas2_Singleparam {

	public static void main(String[] args) {
	
	Flammable flammable=(msg) ->	{
		return "Hello "+msg;
	};
	
	String s1=flammable.flame("Vishal");
	System.out.println(s1);
	
	Flammable flammable2=msg-> "Hola "+msg;
		
		String s2=flammable2.flame("Keshav");
		System.out.println(s2);
	}
}
