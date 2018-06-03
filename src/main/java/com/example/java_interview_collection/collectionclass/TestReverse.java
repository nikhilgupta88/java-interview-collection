package com.example.java_interview_collection.collectionclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestReverse {

	public static void main(String[] args) {
		  // Let us create a list of strings
        List<String>  mylist = new ArrayList<String>();
        mylist.add("practice");
        mylist.add("code");
        mylist.add("quiz");
        mylist.add("geeksforgeeks");
 
        System.out.println("Original List : " + mylist);
 
        // Here we are using reverse() method
        // to reverse the element order of mylist
        Collections.reverse(mylist);
 
        System.out.println("Modified List: " + mylist);

        
        // Let us create an array of integers
        Integer arr[] = {10, 20, 30, 40, 50};
 
        System.out.println("Original Array : " +
                                Arrays.toString(arr));
         
        // Please refer below post for details of asList()
        // https://www.geeksforgeeks.org/array-class-in-java/
        Collections.reverse(Arrays.asList(arr));
         
        System.out.println("Modified Array : " +
                                Arrays.toString(arr));
	}

}
