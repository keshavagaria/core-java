package com.hcl.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{

	private int id;
	private static String fatherName;
	private final String motherName="Damini";
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getFatherName() {
		return fatherName;
	}
	public static void setFatherName(String fatherName) {
		Employee.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(id);
		out.writeChars(name);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		id = in.readInt();
		name=in.readLine();
		
	}
	
	
}
