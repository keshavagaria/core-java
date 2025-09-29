package com.hcl.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Student {
	
      private final int id;
	  private final String name;
	  private final Date mutableField;
	  private final List<String> movies;
	  private final Set<String> webSeries;
	  private final Map<String,String> hobbies;
	
	public Student(int id, String name, Date date,List<String> movs,
							Set<String> series,Map<String,String> hobbs) {
		
		this.id = id;
		this.name = name;
		this.mutableField = new Date(date.getTime());
		
		List<String> tempList=new ArrayList<>();
		Set<String> tempSet=new HashSet<>();
		Map<String,String> tempMap = new HashMap<>();
		
		for(String m: movs) {
			tempList.add(m);
		}
		for(String s : series) {
			tempSet.add(s);
		}
		for(Map.Entry<String, String> entry : hobbs.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.movies=tempList;
		this.webSeries=tempSet;
		this.hobbies=tempMap;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getMutableField() {
		return new Date(mutableField.getTime());
	}

	
	public Map<String, String> getHobbies() {
		
		Map<String,String> tempMap = new HashMap<>();
		
		for(Map.Entry<String, String> entry : hobbies.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
//		hobbies.put("9", "Cooking");
//		tempMap.put("6", "newHobby");
		return tempMap;
	}

	
	  public List<String> getMovies() {
		  
		  List<String> tempList=new ArrayList<>();
		
			for(String m: movies) {
				tempList.add(m);
			}
								
			return tempList;
		}

	public Set<String> getWebSeries() {
		Set<String> tempSet=new HashSet<>();
		for(String s : webSeries) {
			tempSet.add(s);
		}
		return tempSet;
	}

	  
}
