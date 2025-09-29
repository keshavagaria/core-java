package com.hcl.vector_hashtables;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		//default capacity - 10
		Vector<String> movies=new Vector<String>(4);
		movies.add("The Dark Knight");
		movies.add("The Dark Knight Rises");
		movies.addElement("Batman Begins");
		movies.addElement("Man of Steel");
		movies.addElement("Superman");

		System.out.println(movies.size()+" "+movies.capacity());

		//looping by iterator
		System.out.println("loop through via iterator: ");
		Iterator<String>itr= movies.iterator();
		while(itr.hasNext()) {
			String value=itr.next();
			System.out.println(value);

		}

		//looping by enumerator
		System.out.println();
		System.out.println("loop through via Enumerator: ");
		Enumeration<String> enumeration=  movies.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

//		System.out.println(); 
//		System.out.println("loop through via For Each Loop: ");
//		for(String m : movies) {
//			System.out.println(movies.add("new Movie")); 
//		}
	}

}
