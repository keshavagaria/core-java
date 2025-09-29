package com.hcl.demo2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address=new Address("rohini","Delhi","India");
		
		
		List<Address> addresses=new ArrayList<>();
		//addresses.add(address);
		addresses.add(new Address("Kanpur", "UP", "India"));
		addresses.add(new Address("Chail", "Himachal", "India"));
		
		
		Employee employee =new Employee(101,"Raman",address,addresses);
		
		System.out.println(address);
		System.out.println(employee+" "+employee.getAddresses());
		
//		address.setCity("Mumbai");
//		address.setStreet("Bandra");
		
		// Mutating Address class -> No effect
		employee.getAddress().setStreet("Indore");
		employee.getAddress().setCity("MP");
		employee.getAddress().setCountry("Nepal");
		
		// Mutating List<Address> -> No effect
		employee.getAddresses().add(new Address("Patna","Bihar","Pakistan"));
		
		System.out.println(address);
		System.out.println(employee+" "+employee.getAddresses());
	}
}
