package com.hcl.propertiesClass;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		Properties p=new Properties();
		
		p.setProperty("user", "Vishal");
		p.setProperty("password", "Singh");
		
		p.store(new FileWriter("info.properties"), "Properties Example");
	}
}
