package com.example3;

public class Person implements Cloneable{

	private int id;
	private String name;
	private Address address;
	
	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Person person = new Person();
		Address address = new Address();
		
		address.setCity(this.getAddress().getCity());
		address.setState(this.getAddress().getState());
		
		person.setId(this.getId());
		person.setName(this.getName());
		//person.setAddress((Address)this.getAddress().clone());
		person.setAddress(address);
		return person;
		//return super.clone();
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
}
