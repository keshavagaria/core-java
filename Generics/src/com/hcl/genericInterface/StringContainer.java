package com.hcl.genericInterface;

public class StringContainer implements Container<String>{

	String value;
	
	@Override
	public void add(String item) {
		this.value = item;
		
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return value;
	}

}
