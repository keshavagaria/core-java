package com.hcl.demo2;

import java.util.ArrayList;
import java.util.List;

public final class Employee{

	private final int id;
	private final String name;
	private final Address address;
	private final List<Address> addresses;

	public Employee(int id, String name, Address address,List<Address> adds) throws CloneNotSupportedException {
		
		this.id = id;
		this.name = name;
		this.address = (Address) address.clone();
		//this.address = new Address(address.getStreet(), address.getCity(), address.getCountry());
		
		List<Address> tempList=new ArrayList<Address>(adds);
		this.addresses=tempList;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() throws CloneNotSupportedException {
		return (Address) this.address.clone();
	}

	 
	public List<Address> getAddresses() {
		List<Address> tempList=new ArrayList<Address>(this.addresses);

		return tempList;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address+"]";
	}

	

	
}
