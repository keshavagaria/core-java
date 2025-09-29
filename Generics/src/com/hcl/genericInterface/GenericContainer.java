package com.hcl.genericInterface;

public class GenericContainer<T> implements Container<T>{

	T item;
	@Override
	public void add(T item) {
		this.item = item;
		
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return this.item;
	}

}
