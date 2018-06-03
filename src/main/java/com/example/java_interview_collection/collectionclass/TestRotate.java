package com.example.java_interview_collection.collectionclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestRotate {

	public static void main(String[] args) {
	
		    // Let us create a list of strings
			List<String>  mylist = new ArrayList<String>();
		        mylist.add("practice");
		        mylist.add("code");
		        mylist.add("quiz");
		        mylist.add("geeksforgeeks");
		  
		    System.out.println("Original List : " + mylist);
		  
		    // Here we are using rotate() method
		    // to rotate the element by distance 2
		    Collections.rotate(mylist, 2);
		  
		    System.out.println("Rotated List: " + mylist);
		    
		    
		    
		    
		    
		    // Let us create an array of integers
	        Integer arr[] = {10, 20, 30, 40, 50};
	  
	        System.out.println("Original Array : " + Arrays.toString(arr));
	          
	        // Please refer below post for details of asList()
	        // https://www.geeksforgeeks.org/array-class-in-java/
	        // rotating an array by distance 2
	        Collections.rotate(Arrays.asList(arr), 2);
	          
	        System.out.println("Modified Array : " +  Arrays.toString(arr));
	}

}
