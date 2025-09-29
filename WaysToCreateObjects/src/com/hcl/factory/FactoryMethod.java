package com.hcl.factory;

public class FactoryMethod {

	public static void main(String[] args) {
		
		ShapeFactory factory=new ShapeFactory();
		
		Shape circle=factory.getShape("circle");
		circle.draw();
		
		Shape rect=factory.getShape("rectangle");
		rect.draw();
	}
}
