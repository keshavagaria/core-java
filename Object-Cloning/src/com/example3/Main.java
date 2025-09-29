package com.example3;

import java.util.ArrayList;
import java.util.List;

import com.example3.Address;

public class Main {

	public static void main(String[] args) {
		
		Address address = new Address("Lucknow","UP");
		
		Person person1 = new Person(201,"Dawood", address);
		
		Person person2 = null;
		try {
			// Deep Copy
			person2 = (Person) person1.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println("Deep Cloning: "+person1.hashCode()+" "+person2.hashCode());
		System.out.println("Shallow Cloning in Deep Cloning :"+person1.getAddress().hashCode()+" "+
															   person2.getAddress().hashCode());
		person1.getAddress().setCity(null);
		System.out.println(person1);
		System.out.println(person2);
	}
}
