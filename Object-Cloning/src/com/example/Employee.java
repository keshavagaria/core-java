package com.example;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{

	private int id;
	private String name;
	private List<String> movies=new ArrayList<String>();
	private List<Address> addresses=new ArrayList<Address>();
	
	
	public Employee() {}
	
	public Employee(int id, String name,List<String> movies, List<Address> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.movies = movies;
		this.addresses = addresses;
		
	}

	

	public List<String> getMovies() {
		return movies;
	}
	public void setMovies(List<String> movies) {
		this.movies = movies;
	}
	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Employee employee = new Employee();
		
		employee.setId(this.getId());
		employee.setName(this.getName());
//		for( String movie:this.getMovies()) {
//			employee.getMovies().add(movie);
//		}
//		for(Address address:this.getAddresses()) {
//			employee.getAddresses().add(address);
//		}
		employee.setMovies(new ArrayList<String>(this.movies));
		employee.setAddresses(new ArrayList<Address>(this.getAddresses()));
		return employee;
		//return super.clone();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", movies=" + movies + ", addresses="
				+ addresses + "]";
	}

	
	
}
