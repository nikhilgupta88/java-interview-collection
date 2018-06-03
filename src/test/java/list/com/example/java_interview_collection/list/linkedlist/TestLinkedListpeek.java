package com.example.java_interview_collection.list.linkedlist;

import java.util.LinkedList;

public class TestLinkedListpeek {
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

	     //peek()
	     System.out.println(list.peek());
	 
	     //peekFirst()
	     System.out.println(list.peekFirst());
	 
	     //peekLast()
	     System.out.println(list.peekLast());

	     // Should be same as peek methods does not remove
	     System.out.println("LinkedList after: "+list);
	     
	     
	     // push Element the list
	     list.push("NEW ELEMENT");

	     // Display after push operation
	     System.out.println("LinkedList contains: "+list);
	     
	     // pop Element from list and display it
	     System.out.println("Element removed: "+list.pop());

	     // Display after pop operation
	     System.out.println("LinkedList after: "+list);
	  }
}

