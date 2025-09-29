package com.hcl.externalization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee emp1=new Employee();
		emp1.setId(999);
		emp1.setFatherName("Rakesh");
		emp1.setName("Vishal");
		
		//Serialization
		FileOutputStream fos=new FileOutputStream(
				"C:\\Users\\visha\\eclipse-workspace\\core-java\\serialization-deserialization-externalization\\output2.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		oos.close();
		fos.close();
		
		//Deserialization
		FileInputStream fis=new FileInputStream(
				"C:\\Users\\visha\\eclipse-workspace\\core-java\\serialization-deserialization-externalization\\output2.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e=(Employee) ois.readObject();
		System.out.println(e.getId()+" "+e.getName()+" "+e.getFatherName()+" "+e.getMotherName());
		ois.close();
		fis.close();
	}

}
