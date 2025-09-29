package com.hcl.propertiesClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileReader reader=new FileReader("info.properties");
		
		Properties p=new Properties();
		p.load(reader);
		
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}
}
