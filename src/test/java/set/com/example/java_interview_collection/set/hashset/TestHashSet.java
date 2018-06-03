package com.example.java_interview_collection.set.hashset;

import java.util.HashSet;

public class TestHashSet {
	public static void main(String args[]) {
	      // HashSet declaration
	      HashSet<String> hset = new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      //Displaying HashSet elements
	      System.out.println("Original HashSet : "+hset);
	      
	      //Check Whether element in hashset or not
	      System.out.println("Mango is in HashSet : " +hset.contains("Mango"));
	        
	      System.out.println("Mangoooo is in HashSet : "+hset.contains("Mangoooo"));
	      
	      //remove elements from hashset
	      hset.remove("Orange");
	      System.out.println("After removing from HashSet : "+hset);
	      //clear hashset
	      //hset.removeAll(hset);
	      hset.clear();
	      System.out.println("After clear HashSet : "+hset);
	      
	      
	      
	      
	    }
}
