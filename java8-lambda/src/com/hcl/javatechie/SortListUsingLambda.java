package com.hcl.javatechie;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListUsingLambda {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,4,1,5);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		//using lambda
		list.stream().sorted().forEach(s->System.out.print(s+" "));   //ascending
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s+" "));  // descending
		
		List<Employee> empList = Arrays.asList(
				new Employee(101, "Vishal","IT",1000),
				new Employee(102, "Rahul","MEDICAL",2000),
				new Employee(103, "Keanu","Weather",3000),
				new Employee(104, "Tom","LEGAL",3500)
				);
		
/*	
		 Collections.sort(empList , new Comparator<Employee>() {
		 

				@Override
				public int compare(Employee e1, Employee e2) {
					return e1.getName().compareTo(e2.getName());
				}
				
			});
			
			Collections.sort(empList , new Comparator<Employee>() {

				@Override
				public int compare(Employee e1, Employee e2) {
					if(e1.getId()==e2.getId())
						return 0;
					else if(e1.getId()>e2.getId()) 
						return 1;
					else
						return -1;
				}
				
			});
			
*/
		
		System.out.println("\nSorting based on name");
		Collections.sort(empList , (e1, e2)->  e1.getName().compareTo(e2.getName()));
		
		for(Employee e : empList) {
			System.out.println(e);
		}
		
		System.out.println("Sorting based on id");
		Collections.sort(empList , (e1, e2) ->{
				if(e1.getId()==e2.getId())
					return 0;
				else if(e1.getId()>e2.getId()) 
					return 1;
				else
					return -1;
			});
		
		for(Employee e : empList) {
			System.out.println(e);
		}
		
		//using lambda
		System.out.println("Sorting based on id using lambda");
		empList.stream().sorted((e1,e2)->e1.getSalary()-e2.getSalary()).forEach(p->System.out.print(p+" ")); //ascending
		System.out.println();
		empList.stream().sorted((e1,e2)->e2.getSalary()-e1.getSalary()).forEach(System.out::print); //descending
		
		//OR
		System.out.println();
		empList.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::print);  //ascending
		
		System.out.println();
		empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);
		
		
	}
	
}
