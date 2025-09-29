package com.hcl.boundedTypeParameters;

import java.io.Serializable;

public class Box<T extends Number & Serializable> {
	
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	

}
