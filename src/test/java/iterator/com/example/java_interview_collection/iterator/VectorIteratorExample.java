package com.example.java_interview_collection.iterator;

import java.util.Iterator;
import java.util.Vector;

public class VectorIteratorExample {
	  public static void main(String[] args) {

	     // Creating a Vector of Strings
	     Vector<String> vector = new Vector<String>();
	 
	     //Adding elements to the Vector
	     vector.add("Mango");
	     vector.add("Orange");
	     vector.add("Apple");
	     vector.add("Grapes");
	     vector.add("Kiwi");
	 
	     //Obtaining an iterator
	     Iterator<String> it = vector.iterator();

	     System.out.println("Vector elements are:");
	     while(it.hasNext()){
	       System.out.println(it.next());
	     }
	  }
	}