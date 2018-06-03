package com.example.java_interview_collection.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	public static void main(String[] args) {
	        // Create a vector and print its contents
	        Vector<Integer> v = new Vector<Integer>();
	        for (int i = 0; i < 10; i++)
	            v.addElement(i);
	        System.out.println(v);
	 
	        // At beginning e(cursor) will point to
	        // index just before the first element in v
	        Enumeration<Integer> e = v.elements();
	 
	        // Checking the next element availability
	        while (e.hasMoreElements())
	        {
	            // moving cursor to next element
	            int i = (Integer)e.nextElement();
	 
	            System.out.print(i + " ");
	        }
    }
}
