package com.example2;

class Circle implements Cloneable{
	
	int x;
	int y;
	
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + "]";
	}
	
	
}
public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle c1=new Circle(10, 20);
		//System.out.println(c1+" "+c1.hashCode());
		
		
		Circle c2 = (Circle) c1.clone();        // deep copy
		Circle c3 =  c1;      					//shallow copy
		
		Circle c4=new Circle();
		c4.x = c1.x;
		c4.y = c1.y;							// deep copy
		
		c1.x=1000;
		System.out.println(c1+" "+c1.hashCode());
		System.out.println(c2+" "+c2.hashCode());
		System.out.println(c3+" "+c3.hashCode());
		System.out.println(c4+" "+c4.hashCode());
	}
}
