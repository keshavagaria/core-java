package com.hcl.genericInterface;

public class IntegerContainer implements Container<Integer>{

	int value;
	@Override
	public void add(Integer item) {
		this.value=item;
		
	}

	@Override
	public Integer get() {
		// TODO Auto-generated method stub
		return value;
	}

}
