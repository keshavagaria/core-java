package com.hcl.lambdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lambdas4_forEach {

	public static void main(String[] args) {

		List<String> movies = new ArrayList<String>();
		movies.add("Batman");
		movies.add("SpiderMan");
		movies.add("Iron Man");
		movies.add("Superman");

		movies.forEach(list -> System.out.println(list));

		System.out.println("------------------------------------------");
		Set<String> cartoon = new HashSet<String>();
		cartoon.add("Lion King");
		cartoon.add("Powerpuff Girls");
		cartoon.add("The Mask");
		cartoon.add("Doremon");

		cartoon.forEach(set -> System.out.println(set));
		System.out.println("------------------------------------------");

		Map<Integer, String> series = new HashMap<Integer, String>();
		series.put(1, "Flash");
		series.put(2, "Game of Thrones");
		series.put(3, "Breaking Bad");
		series.put(4, "Gotham");

		series.forEach((K, V) -> System.out.println(K + " " + V));
	}
}
