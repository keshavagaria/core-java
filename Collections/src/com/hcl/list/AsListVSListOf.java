package com.hcl.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Arrays.asList() vs Collections.unmodifiableList() vs List.Of()
public class AsListVSListOf {

	public static void main(String[] args) {
		
		String[] movies = {"Batman","Iron Man","Spider man"};
		// Returns a fixed-size list backed by the specified array
		// Modifiable List
		List<String> moviesList = Arrays.asList(movies);
		//moviesList.add("Fantastic Four");
		moviesList.set(1, "Thor");
		// moviesList.remove(0);
		System.out.println(moviesList);
		
		for(String movie: movies) {
			System.out.println(movie);
		}
		
		List<String> series =  new ArrayList<String>();
			series.add("Friends");
			series.add("Game of Thrones");
			series.add("Breaking Bad");
			series.add("Superman");
		
		// Returns the unmodifiable view of the specified list
		List<String> seriesList =  Collections.unmodifiableList(series);
		//seriesList.add("Superman");
		//seriesList.set(1, "Superman");
		//seriesList.remove(0);
		System.out.println(seriesList);
		
		// Returns an unModifiable and Immutable List
		// cannot add, remove or modify the elements of the list
		List<String> salmanList = List.of("Dabang","Wanted","Prem Ratan Dhan Payo","Kick");
		//salmanList.add("Tere Naam");
		//salmanList.set(1,"Tere Naam");
		//salmanList.remove(0);
		System.out.println(salmanList);
	}
}
