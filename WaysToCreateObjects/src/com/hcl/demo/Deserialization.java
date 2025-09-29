package com.hcl.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Bike implements Serializable{
	
	public void run() {
		System.out.println("Hayabusa is Running...");
	}
}
public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Bike bike=new Bike();
		bike.run();
		FileOutputStream fos=new FileOutputStream("Sample.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(bike);
		
		FileInputStream fis=new FileInputStream("Sample.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Bike readBike=(Bike)ois.readObject();
		
		readBike.run();
		
		System.out.println(bike.hashCode()+" "+readBike.hashCode());
	}
}
