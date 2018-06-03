package com.example.java_interview_collection.set.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) {
		// Create a TreeSet and inserting elements
        SortedSet<String> sites = new TreeSet<String>();
        sites.add("practice");
        sites.add("geeksforgeeks");
        sites.add("quiz");
        sites.add("code");
 
        System.out.println("Sorted Set: " + sites);
        System.out.println("First: " + sites.first());
        System.out.println("Last: " + sites.last());
 
        // Getting elements before quiz (Excluding) in a sortedSet
        SortedSet<String> beforeQuiz = sites.headSet("quiz");
        System.out.println(beforeQuiz);
 
        // Getting elements between code (Including) and 
        // practice (Excluding)
        SortedSet<String> betweenCodeAndQuiz = sites.subSet("code","practice");
        System.out.println(betweenCodeAndQuiz);
 
        // Getting elements after code (Including)
        SortedSet<String> afterCode = sites.tailSet("code");
        System.out.println(afterCode);

	}

}
