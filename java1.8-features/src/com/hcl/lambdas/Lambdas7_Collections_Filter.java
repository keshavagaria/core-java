package com.hcl.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Products{
	int id;
	String name;
	float price;
	
	public Products(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}
public class Lambdas7_Collections_Filter {

	public static void main(String[] args) {
		
		List<Products> productsList=new ArrayList<Products>();
		productsList.add(new Products(201, "Laptop", 60000f));
		productsList.add(new Products(202, "Mobile", 5000f));
		productsList.add(new Products(203, "Tablet", 40000f));
		productsList.add(new Products(204, "AC", 80000f));
		
		// using lambda to filter data  
		Stream<Products> filtered_data=  productsList.stream().filter(p->p.price>50000);
		
		// using lambda to iterate through collection  
		filtered_data.forEach(pro->System.out.println(pro.id+" "+pro.name+" "+pro.price));
	}
}
