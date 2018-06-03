package com.example.java_interview_collection.list.vector;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

import java.util.Vector;

public class ConvertVectorToArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Step1: Creating a Vector of String elements
	     Vector<String> vector = new Vector<String>();
	 
	     // Step2: Populating Vector
	     vector.add("Tim");
	     vector.add("Rock");
	     vector.add("Hulk");
	     vector.add("Rick");
	     vector.add("James");
	 
	    // Step3: Displaying Vector elements
	    System.out.println("Vector Elements :"+vector);
	    
	 
	    // Step4: Converting Vector to List
	    List<String> list = Collections.list(vector.elements());
	 
	    // Step 5: Displaying List Elements
	    System.out.println("List Elements :"+list);
	    
	  //Converting Vector to ArrayList
	     ArrayList<String> arraylist = new ArrayList<String>(vector);
	 
	     //Displaying ArrayList Elements
	     System.out.println("ArrayList Elements :"+arraylist);
	    
	   //Converting Vector to String Array
	     String[] array = vector.toArray(new String[vector.size()]);
	  
	     //Displaying Array Elements
	     System.out.println("String Array Elements :");
	     for(int i=0; i < array.length ; i++){
	        System.out.print(array[i]+" ");
	     }
	     
	}

}
