package com.hcl.naiveWay;

public class NaiveDemo {

	public static void main(String[] args) {
		
		IntegerPrinter printer=new IntegerPrinter(100);
		printer.show();
		
		DoublePrinter printer2=new DoublePrinter(100.235);
		printer2.show();
		
		StringPrinter printer3=new StringPrinter("Hola");
		printer3.show();
	}
}
