package com.example.java_interview_collection.collectionclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestShuffle {

	public static void main(String[] args) {
		 ArrayList<String>  mylistt = new ArrayList<String>();
	        mylistt.add("code");
	        mylistt.add("quiz");
	        mylistt.add("geeksforgeeks");
	        mylistt.add("quiz");
	        mylistt.add("practice");
	        mylistt.add("qa");
	 
	        System.out.println("Original List : \n" + mylistt);
	 
	        Collections.shuffle(mylistt);
	 
	        System.out.println("\nShuffled List : \n" + mylistt);
	        
	        
	        ArrayList<String>  mylist = new ArrayList<String>();
	        mylist.add("code");
	        mylist.add("quiz");
	        mylist.add("geeksforgeeks");
	        mylist.add("quiz");
	        mylist.add("practice");
	        mylist.add("qa");
	 
	        System.out.println("Original List : \n" + mylist);
	 
	        // Here we use Random() to shuffle given list.
	        Collections.shuffle(mylist, new Random());
	        System.out.println("\nShuffled List with Random() : \n"
	                                                     + mylist);
	 
	        // Here we use Random(3) to shuffle given list.
	        Collections.shuffle(mylist, new Random(3));
	        System.out.println("\nShuffled List with Random(3) : \n"
	                                                     + mylist);
	 
	        // Here we use Random(3) to shuffle given list.
	        Collections.shuffle(mylist, new Random(5));
	        System.out.println("\nShuffled List with Random(5) : \n"
	                                                     + mylist);
	}

}
