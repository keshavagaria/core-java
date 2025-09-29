package com.hcl.genericInterface;

public interface Container<T>{
		
	void add(T item);
	
	T get();
}
