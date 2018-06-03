package com.example.java_interview_collection.collectionclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class TestReverseOrderUserDefined {

	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));
 
        System.out.println("Unsorted : "+ar);
        
 
        // Sorting a list of students in descending order of
        // roll numbers using a Comparator that is reverse of
        // Sortbyroll()
        Comparator<Student> c = Collections.reverseOrder(new SortByRoll());
        Collections.sort(ar, c);
 
        System.out.println("\nSorted by rollno :" +ar);
        
	}

}

 
