package com.hcl.lambdas;

@FunctionalInterface
interface Drawable{
	
	void draw();
}

public class Lambdas{

	public static void main(String[] args) {
//		Drawable drawable=new Drawable() {
//			
//			@Override
//			public void draw() {
//				System.out.println("Drawing from Anonymous Inner Class");
//				
//			}
//		};
//		
		Drawable drawable=()-> System.out.println("Drawing from Anonymous Inner Class");
				
		drawable.draw();
	}

	
}
