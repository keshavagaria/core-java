package com.hcl.demo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		
		Cat cat = new Cat("Stella", 6);
		
		Field[]	catFields = cat.getClass().getDeclaredFields();
		
		for(Field field : catFields) {
			System.out.println(field.getName());
			if(field.getName().equals("name")) {
				field.setAccessible(true);
				field.set(cat, "Jimmy Shergill");
			}
		}
		System.out.println(cat.getName());
		
		Method[] catMethods = cat.getClass().getDeclaredMethods();
		for(Method method : catMethods) {
			System.out.println(method.getName());
			if(method.getName().equals("meow")) {
				method.invoke(cat);
			}else if(method.getName().equals("heyThisisPrivate")) {
				method.setAccessible(true);
				method.invoke(cat);
			}else if(method.getName().equals("iAmPublicStaticMethod")) {
				method.invoke(null);
			}
		}
	}

}
