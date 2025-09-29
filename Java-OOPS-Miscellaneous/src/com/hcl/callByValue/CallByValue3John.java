package com.hcl.callByValue;


class Cheese{
	
	private int levelOfStinkiness;

	public int getLevelOfStinkiness() {
		return levelOfStinkiness;
	}

	public void setLevelOfStinkiness(int levelOfStinkiness) {
		this.levelOfStinkiness = levelOfStinkiness;
	}
	
	
}
public class CallByValue3John {

	public static void main(String[] args) {
		Cheese myCheese=new Cheese();
		myCheese.setLevelOfStinkiness(10);
		System.out.println(myCheese.getLevelOfStinkiness());
		
		increaseStinkiness(myCheese);
		System.out.println(myCheese.getLevelOfStinkiness());
		increaseStinkiness2(myCheese);
		System.out.println(myCheese.getLevelOfStinkiness());
	}
	
	//BTS - Cheese cheese=myCheese    //shallow copy
	private static void increaseStinkiness(Cheese cheese) {
		cheese.setLevelOfStinkiness(cheese.getLevelOfStinkiness()+1);
	}
	
	//BTS - Cheese cheese2=myCheese    //shallow copy  
		private static void increaseStinkiness2(Cheese cheese2) {
			cheese2=new Cheese();    //deep Copy
			cheese2.setLevelOfStinkiness(420);
			System.out.println(cheese2.getLevelOfStinkiness());
		}
	
}
