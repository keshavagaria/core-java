package com.hcl.callByValue;


class Person{
	
	int salary=50000;
	
	void take(int salary) {
		
		salary=salary+1000;
	}
}
public class CallByValue {
public static void main(String[] args) {
	
	Person person=new Person();
	System.out.println(person.salary);
	person.take(2000);
	System.out.println(person.salary);
}
}
