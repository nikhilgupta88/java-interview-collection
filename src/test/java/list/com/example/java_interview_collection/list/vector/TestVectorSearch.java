package com.example.java_interview_collection.list.vector;

import java.util.Vector;

public class TestVectorSearch {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		 
	     //Add elements to Vector
	     vector.add("Kate");
	     vector.add("Patt");
	     vector.add("Kluge");
	     vector.add("Karon");
	     vector.add("Patt");
	     vector.add("Monica");
	     vector.add("Patt");
	 
	     System.out.print("Vector List is : "+vector);
	     //This would return the index of first occurrence
	     int first_index = vector.indexOf("Patt");
	     System.out.println("\nFirst Occurrence of Patt at index: "+first_index);
	 
	     //This would return the index of last occurrence
	     int last_index = vector.lastIndexOf("Patt");
	     System.out.println("Last Occurrence of Patt at index: "+last_index);
	 
	     //This would start search from index 2(inclusive)
	     int after_index = vector.indexOf("Patt", 2);
	     System.out.println("Occurrence after index 2: "+after_index);
	 
	     //This would search the element backward starting from index 6(inclusive)
	     int before_index = vector.lastIndexOf("Patt", 6);
	     System.out.println("Occurrence before index 6: "+before_index);
	}

}
