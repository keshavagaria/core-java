package com.hcl.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		List<String> movies=new ArrayList<>();
		movies.add("THe Matrix");
		movies.add("John Wick");
		
		Set<String> series=new HashSet<>();
		series.add("Sacred GAmes");
		series.add("Panchayat");
		
		Map<String,String> map = new HashMap<>();
		map.put("1", "Swimming");
		map.put("2", "Skating");
		
		Student student=new Student(101,"Keshav",new Date(),movies,series,map);
		
		System.out.println(student.getId()+" "+student.getName()+" "+student.getMutableField()+" "+
					 student.getMovies()+" "+student.getWebSeries()+" "+student.getHobbies());
		
		
		movies.add("Bellarina");
		student.getMovies().add("Bellarina");
		
		series.add("Paatal Lok");
		student.getWebSeries().add("Criminal Justice");
		map.put("3", "Piano");
		student.getHobbies().put("3", "Piano");
		
//		student.id=600;
//		student.name="Banrakas";
//		student.mutableField=new Date();
		
		System.out.println(student.getId()+" "+student.getName()+" "+student.getMutableField()+" "+
				student.getMovies()+" "+student.getWebSeries()+" "+student.getHobbies());
		
	}


}
