package com.example.java_interview_collection.collectionclass;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {
	public static void main(String[] args)
    {
        // Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
	        al.add("Geeks For Geeks");
	        al.add("Friends");
	        al.add("Dear");
	        al.add("Is");
	        al.add("Superb");
 
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);
 
        // Let us print the sorted list
        System.out.println("List after the use of Collection.sort() :\n" + al);
    
        // Create a list of strings
        ArrayList<String> all = new ArrayList<String>();
	        all.add("Geeks For Geeks");
	        all.add("Friends");
	        all.add("Dear");
	        all.add("Is");
	        all.add("Superb");
 
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(all, Collections.reverseOrder());
 
        // Let us print the sorted list
        System.out.println("List after the use of Collection.sort() :\n" + all);
    }

}
