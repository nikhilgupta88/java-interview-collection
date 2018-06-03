package com.example.java_interview_collection.set.treeset;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TreeSet of String Type
        TreeSet<String> tset = new TreeSet<String>();

        // Adding elements to TreeSet<String>
        tset.add("ABC");
        tset.add("String");
        tset.add("Test");
        tset.add("Pen");
        tset.add("Ink");
        tset.add("Jack");
  
        //Displaying TreeSet
        System.out.println("Original TreeSet : "+tset);
        //Duplicates are not allowed
        tset.add("Ink");
        System.out.println("Original TreeSet : "+tset);
        //ADD NULL Values
        //tset.add(null); NullPointerException
        
        // TreeSet of Integer Type
        TreeSet<Integer> tset2 = new TreeSet<Integer>();

        // Adding elements to TreeSet<Integer>
        
        tset2.add(88);
        tset2.add(7);
        tset2.add(101);
        tset2.add(0);
        tset2.add(3);
        //tset2.add(null);
       
        System.out.println("Original TreeSet : "+tset2);

        System.out.println("The First element :"+tset2.first()); // 0
        System.out.println("The Last element :"+tset2.last()); //101
        
        // Elements less than O. It prints
        System.out.println(tset2.headSet(5)); // 0, 3
 
        // Elements greater than or equal to 44.
        System.out.println(tset2.tailSet(44)); // 88, 101
 
        // Elements ranging from 2 to 101
        
        System.out.println(tset2.subSet(2,101)); //3, 7, 88
  
        // Deletes all elements from ts5.
        tset2.clear();
 
        // Prints nothing
        System.out.println(tset2);
	}

}
