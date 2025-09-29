package com.hcl.demo;

import java.util.concurrent.Callable;

public class CallableTask<V> implements Callable<V>{

	@Override
	public V call() throws Exception {
		Thread.sleep(100);
		return null;
	}

}
