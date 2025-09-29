package com.company.syncCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class InventoryManager {
	
	/*
	 * Collections.synchronizedList(list); 
	 * Collections.synchronizedSet(set);
	 * Collections.synchronizedMap(map);
	 */
	
	
		
	//List<Product> soldProductList=new CopyOnWriteArrayList<>();
	//List<Product> syncSoldProductList=Collections.synchronizedList(soldProductList);
	Set<Product> soldProductSet=new CopyOnWriteArraySet<>();
	
	
	List<Product> purchasedProductList=new ArrayList<>();	

	public void populateSoldProduct() {
		for(int i=0;i<10;i++) {
			Product product=new Product(i, "Test_Product_"+i);
			soldProductSet.add(product);
			System.out.println("ADDED: "+product);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void displaySoldProducts() {
		for(Product p:soldProductSet) {
			
			System.out.println("Sold Product:"+p);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
