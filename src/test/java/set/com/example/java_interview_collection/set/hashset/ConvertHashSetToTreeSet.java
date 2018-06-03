package com.example.java_interview_collection.set.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashSetToTreeSet {

	public static void main(String[] args) {
		 // Create a HashSet
	     HashSet<Integer> hset = new HashSet<Integer>();
	 
	     //add elements to HashSet
	     hset.add(9);
	     hset.add(19);
	     hset.add(49);
	     hset.add(91);
	     hset.add(3);
	     hset.add(22);
	     
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: "+ hset);
	 
	     // Creating a TreeSet of HashSet elements
	     Set<Integer> tset = new TreeSet<Integer>(hset);
	 
	     // Displaying TreeSet elements
	     System.out.println("TreeSet contains: "+tset);
	     
	    
	     
	}

}
