package com.hcl.non_static_nested;

class Outerr{
	
	private int i=750;  //instance variable
	
	void display() {
		
		//local variable must be final till jdk 1.7 only  
		int local=500;   //local variable -cant be private,public,protected
		System.out.println("Outer");
		
		class Innerr{
			private int v=420; //instance variable
			void say() {
				int local2=4;  //local variable    -cant be private,public,protected
				System.out.println("Saying from inner "+v+" "+i+" "+local+" "+local2);
			}
		}
		Innerr innerr=new Innerr();
		innerr.say();
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		Outerr outerr=new Outerr();
		outerr.display();
		
	}
}
