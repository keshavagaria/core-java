package com.hcl.javatechie;

@FunctionalInterface
interface Calculator{
	
	void switchOn();
}

public class CalculatorImpl implements Calculator{
	
	@Override
	public void switchOn() {
		System.out.println("The Switch is On");
		
	}
	
	public static void main(String[] args) {
		
		Calculator calculator = () -> System.out.println("Switched On!!!");
		calculator.switchOn();
		
		Calculator calculator2 = new CalculatorImpl();
		calculator2.switchOn();
	}

	

}
