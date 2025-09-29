package com.hcl.demo;

import java.util.Objects;

public class Geek {

	private int id;
	private String name;
	
	public Geek(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Geek other = (Geek) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Geek [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
