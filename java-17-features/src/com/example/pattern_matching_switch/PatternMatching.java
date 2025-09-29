package com.example.pattern_matching_switch;

public class PatternMatching {
	
	public static void main(String[] args) {
		
		System.out.println(checkType(65464));
		checkType2();
	}

	private static String checkType(Object obj) {
		if(obj instanceof Integer) {
			Integer i = (Integer)obj;
			return "Integer "+i;
					
		}else if(obj instanceof String) {
			String i = (String)obj;
			return "String "+i;
					
		}
		return "Unknown Type";
			
	}
	
	private static String checkType2(Object obj) {
		
		return switch (obj) {
			case Integer i -> "Integer "+i;
			case String s -> "String "+s;
			case Double d -> "Double "+d;
			default -> "Unknown Type";
		};
	}

}
