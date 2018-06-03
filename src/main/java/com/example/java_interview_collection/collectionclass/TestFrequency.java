package com.example.java_interview_collection.collectionclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestFrequency {

	public static void main(String[] args) {
		 // Let us create a list with 4 items
        ArrayList<String> list = new ArrayList<String>();
	        list.add("code");
	        list.add("code");
	        list.add("quiz");
	        list.add("code");
	     
        // count the frequency of the word "code"
        System.out.println("The frequency of the word code is: "+ 
        						Collections.frequency(list, "code")); 
        
     // Let us create an array of integers
        Integer arr[] = {10, 20, 20, 30, 20, 40, 50};
  
        // Please refer below post for details of asList()
        // https://www.geeksforgeeks.org/array-class-in-java/
        int freq = Collections.frequency(Arrays.asList(arr), 20);
  
        System.out.println("The frequency of the 20 is: "+freq);
	}

}
