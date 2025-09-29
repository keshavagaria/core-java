package com.hcl.demo;

public class Main {

	
	public static void main(String[] args) {
		
		Days day = Days.FRIDAY;
		System.out.println(day);
		day.display();
		
		if(day.equals(Days.FRIDAY)) {
			System.out.println("TODAY IS FRIDAY");
		}else {
			System.out.println("NOT FRIDAY");
		}
		
		System.out.println();
		
		Season value = Season.valueOf("SUMMER");
		String temp = Season.SUMMER.getTemperature();
		System.out.println(value);
		System.out.println(temp);
		
		Season[] seasons = Season.values();
		for(Season season :  seasons) {
			System.out.println(season);
		}
		
		switch (value) {
		case SUMMER: {
				System.out.println("SUMMER SEASON");
				break;
		}
		
		case WINTER: {
			System.out.println("WINTER SEASON");
			break;
		}

		default:{
			System.out.println("NO SEASON");
			break;
			}
		}
	}
}
