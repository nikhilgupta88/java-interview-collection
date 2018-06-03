package com.example.java_interview_collection.list.vector;

import java.util.Vector;

public class TestVectorRemoveReplace {

	public static void main(String[] args) {

		 // Creating a Vector of String Elements
	     Vector<String> vector = new Vector<String>();
	 
	     //Adding elements to the Vector
	     vector.add("Harry");
	     vector.add("Steve");
	     vector.add("Vince");
	     vector.add("David");
	     vector.add("Matt");
	     vector.add("Abrahm");
	     vector.add("Conor");

	     System.out.println("Vector elements before remove(): "+vector);
	     
	     // Removing Harry
	     vector.remove("Harry");
	     // Removing Matt
	     vector.remove("Matt");
	 
	     System.out.println("\nVector elements after remove(): "+vector);
	     
	     // Removing 3rd element from Vector
	     Object obj = vector.remove(2);
	  
	     System.out.println("\nElement removed from Vector is: "+obj);
	    
	     System.out.println("\nVector elements after remove(): "+vector);
	     
	     //Replacing index 1 element
	     vector.set(1,"Mark");
	     //Replacing index 2 element
	     vector.set(2,"Jack");
	 
	     System.out.println("Vector elements after replacement: "+vector);
	     System.out.println("Current size of Vector: "+vector.size());
	     
	     //vector.removeAll(vector);
	     
	     // Calling clear() method of Vector API
	     vector.clear();
	     System.out.println("Size of Vector after clear(): "+vector.size());
	}

}
