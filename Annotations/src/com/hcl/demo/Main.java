package com.hcl.demo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Cat cat=new Cat("pussy");
		Dog dog=new Dog();
		
		if(dog.getClass().isAnnotationPresent(VeryImportant.class)) {
			System.out.println("THis thing is very importatnt");
		}
		else {
			System.out.println("this is not important");
		}
		
		Method[] methods=cat.getClass().getDeclaredMethods();
		for(Method method:methods) {
			//System.out.println(method);
			if(method.isAnnotationPresent(RunImmediately.class)) {
				RunImmediately annotation= method.getAnnotation(RunImmediately.class);
				for(int i=0;i<annotation.times();i++) {
					method.invoke(cat);
				}
			}
		}
		
		Field[] fields=cat.getClass().getDeclaredFields();
		for(Field field:fields) {
			//System.out.println(field);
			if(field.isAnnotationPresent(ImportantString.class)) {
				Object objectValue=field.get(cat);
				if(objectValue instanceof String) {
					String stringValue=(String)objectValue;
					System.out.println(stringValue.toUpperCase());
				}
			}
		}
	}
}
