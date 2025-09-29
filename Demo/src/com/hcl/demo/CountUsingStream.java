package com.hcl.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountUsingStream {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Batman");
		list.add("Black Adam");
		
		Long count=list.stream().collect(Collectors.counting());
		System.out.println(count);
	}
}
