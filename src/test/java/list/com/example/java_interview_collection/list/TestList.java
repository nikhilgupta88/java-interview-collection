package com.example.java_interview_collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		//Let us create a list 
		List<Integer> l = new ArrayList<Integer>();
		l.add(856); 
		l.add(56465);
		l.add(652);
		System.out.println(l);
		
		//Let us create a another list
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0, 56); 	// add at index 0
		l1.add(1, 52);	// add at index 1
		l1.add(2, 98);	// add at index 2 
		System.out.println(l1);
		
		System.out.println(l1.get(2)); // get element from given index
		l1.remove(0);  // remove element from given index
		l1.set(0, 253536);  // replace element at given index with new 
		
		System.out.println(l1);
		
		//create a list of that can store string
		List<String> ls = new ArrayList<String>();
			ls.add("Geeks");
	        ls.add("for");
	        ls.add("Geeks");
	        //Search index of first occurrence of given element
		System.out.println("first index of Geeks:" +
                ls.indexOf("Geeks"));
	    //Search index of first occurrence of given element
		System.out.println("last index of Geeks:" +
				ls.lastIndexOf("Geeks"));
		//Search if element is not present
		System.out.println("Index of element not present : " +
				ls.indexOf("Hello"));
		
		
		
		List<String> lss = new ArrayList<String>();
		 
        lss.add("GeeksforGeeks");
        lss.add("Practice");
        lss.add("GeeksQuiz");
        lss.add("IDE");
        lss.add("Courses");
        
        System.out.print(lss);
        List<String> range = new ArrayList<String>();
 
        // return List between 2nd(including)
        // and 4th element(excluding)
        range = lss.subList(2, 4);
 
        System.out.println(range);  // [GeeksQuiz, IDE]
	}
}
