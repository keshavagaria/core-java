package com.hcl.callByValue;

class Employee{
	
	int salary=3000;
	
	public void credit(Employee e) {
	
		e.salary=e.salary+2000;
	
	}
}
public class CallByValue2 {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		System.out.println(employee.salary);
		employee.credit(employee);
		System.out.println(employee.salary);
	}
}
