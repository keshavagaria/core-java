package com.hcl.wrapper;

public class Wrapper {
public static void main(String[] args) {
	
	//Just Like Strings
	Integer i=100;
	Integer j=100;
	Integer k=new Integer(100);
	
	System.out.println(i.equals(j));
	System.out.println(i==j);
	System.out.println(i.hashCode()+" "+j.hashCode());
	
	System.out.println(i.equals(k));
	System.out.println(i==k);
	System.out.println(i.hashCode()+" "+k.hashCode());
	
	int m=50;
	int n=50;
	
	System.out.println(m==n);
	
}
}
