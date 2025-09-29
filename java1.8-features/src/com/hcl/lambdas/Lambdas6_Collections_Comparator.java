package com.hcl.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}
public class Lambdas6_Collections_Comparator {
	
	public static void main(String[] args) {
		
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product(101, "Laptop", 60000f));
		productList.add(new Product(102, "Mobile", 5000f));
		productList.add(new Product(103, "Tablet", 40000f));
		productList.add(new Product(104, "AC", 80000f));
		
		Collections.sort(productList,(p1,p2)->p1.name.compareTo(p2.name));
		
		for(Product product:productList) {
			System.out.println(product.id+" "+product.name+" "+product.price);
		}
		
		System.out.println();
		Collections.sort(productList,(p1,p2)->{
			if(p1.id==p2.id)
				return 0;
			else if(p1.id>p2.id) {
				return 1;
			}
				else 
					return -1;
		});
		
		for(Product product:productList) {
			System.out.println(product.id+" "+product.name+" "+product.price);
		}
	}

}
