package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Address a1 = new Address("rohini","delhi");
		Address a2 = new Address("Jaipur","Rajasthan");
		Address a3 = new Address("Bhimtal","Nainital");
		List<Address> addresses = new ArrayList<>();
		
		addresses.add(a1);
		addresses.add(a2);
		addresses.add(a3);
		
		List<String>  movies = new ArrayList<>();
		movies.add("BATMAN");
		movies.add("JAAT");
		Employee e1 = new Employee(101, "Aman",movies,addresses);
		
		//shallow copy
		Employee e2 = e1;
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("Shallow Copy: "+e1.hashCode()+" "+e2.hashCode());
		
		Employee e3 = null;
		try {
			// Deep Copy
			e3 = (Employee) e1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(e1);
		System.out.println(e3);
		System.out.println("Deep Copy :"+e1.hashCode()+" "+e3.hashCode());
		System.out.println("Shallow copy in Deep Copy :"+e1.getAddresses().hashCode()+" "
														+e3.getAddresses().hashCode());
		System.out.println("Shallow copy in Deep Copy :"+e1.getMovies().hashCode()+" "
														+e3.getMovies().hashCode());
	
		System.out.println(e1);
		System.out.println(e3);
		
		Employee e4 = new Employee();
		e4.setId(e1.getId());
		e4.setName(e1.getName());
		
		// not a right way - creates shallow copies
//		e4.setMovies(e1.getMovies());
//		e4.setAddresses(e1.getAddresses());
		
		// creates deep copies
		for(String movie:e1.getMovies()) {
			e4.getMovies().add(movie);
		}
//		for(Address address:e1.getAddresses()) {
//			e4.getAddresses().add(address);
//		}
		e4.setAddresses(new ArrayList<Address>(e1.getAddresses()));
		
		System.out.println(e1);
		System.out.println(e4);
		System.out.println("Deep Copy: "+e1.hashCode()+" "+e4.hashCode());
		System.out.println("Shallow copy in Deep Copy :"+e1.getAddresses().hashCode()+" "
														+e4.getAddresses().hashCode());
		System.out.println("Shallow copy in Deep Copy :"+e1.getMovies().hashCode()+" "
														+e4.getMovies().hashCode());
		
		System.out.println("-------------------------------------------");
		e1.getMovies().remove(0);
		e1.getAddresses().remove(0);
		System.out.println("e1: "+e1);
		System.out.println("e3: "+e3);
		System.out.println("e4: "+e4);
		System.out.println(e1.hashCode()+" "+e3.hashCode()+" "+e4.hashCode());
	}
}
