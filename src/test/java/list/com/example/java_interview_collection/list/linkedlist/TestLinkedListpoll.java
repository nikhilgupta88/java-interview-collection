package com.example.java_interview_collection.list.linkedlist;

import java.util.LinkedList;

public class TestLinkedListpoll {
	public static void main(String[] args) {

	     // Create a LinkedList of Strings
	     LinkedList<String> list = new LinkedList<String>();

	     // Add few Elements
	     list.add("Element1");
	     list.add("Element2");
	     list.add("Element3");
	     list.add("Element4");

	     // Display LinkList elements
	     System.out.println("LinkedList before: "+list);

	     /* poll(): Retrieves and removes the head (first element)
	      * of this list.
	      */
	     System.out.println("Element removed: "+list.poll());

	     // Displaying list elements after poll() operation
	     System.out.println("LinkedList after: "+list);
	     
	     /* pollFirst(): Retrieves and removes the first element 
	      * of this list, or returns null if this list is empty.
	      */
	     System.out.println("Element removed: "+list.pollLast());

	     // Display after calling pollLast() method
	     System.out.println("LinkedList after: "+list);
	     /* pollFirst(): Retrieves and removes the first element 
	      * of this list, or returns null if this list is empty.
	      */
	     System.out.println("Element removed: "+list.pollFirst());

	     // Display list after calling pollFirst() method
	     System.out.println("LinkedList after: "+list);
	  }
}
