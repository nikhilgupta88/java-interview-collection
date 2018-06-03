package com.example.java_interview_collection.collectionclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestReverseOrder {

	public static void main(String[] args) {
		
		// Create a list of Integers
        ArrayList<Integer> al = new ArrayList<Integer>();
	        al.add(30);
	        al.add(20);
	        al.add(10);
	        al.add(40);
	        al.add(50);
	 
        /* Collections.sort method is sorting the
        elements of ArrayList in descending order. */
        Collections.sort(al, Collections.reverseOrder());
 
        // Let us print the sorted list
        System.out.println("List after the use of Collection.reverseOrder()"+
                           " and Collections.sort() :\n" + al);
        
        
        
     // Create an array to be sorted in descending order.
        Integer [] arr = {30, 20, 40, 10};
 
        /* Collections.sort method is sorting the
        elements of arr[] in descending order. */
        Arrays.sort(arr, Collections.reverseOrder());
 
        // Let us print the sorted array
        System.out.println("Array after the use of Collection.reverseOrder()"+
                           " and Arrays.sort() :\n" + Arrays.toString(arr));
	}

}
