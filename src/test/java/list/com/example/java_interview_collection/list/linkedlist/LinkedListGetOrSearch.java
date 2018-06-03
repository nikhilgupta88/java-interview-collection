package com.example.java_interview_collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListGetOrSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedList
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    linkedlist.add("Item1");
	    linkedlist.add("Item4");
	    linkedlist.add("Item2");
	    linkedlist.add("Item3");
	    linkedlist.add("Item4");
	    linkedlist.add("Item5");
	    linkedlist.add("Item6");
	    linkedlist.add("Item4");
	 
	    // Getting First element of the List
	    Object firstElement = linkedlist.getFirst();
	    System.out.println("First Element is: "+firstElement);
	 
	    // Getting Last element of the List
	    Object lastElement = linkedlist.getLast();
	    System.out.println("Last Element is: "+lastElement);
	    
	  //get(i) returns element present at index i
	    for(int i=0; i < linkedlist.size(); i++){
	      System.out.println("Element at index "+i+" is: "+linkedlist.get(i));
	    }
	  //Searching first occurrence of element
	     int firstIndex = linkedlist.indexOf("Item4");
	     System.out.println("First Occurrence: " + firstIndex);
	 
	     //Searching last occurrence of element
	     int lastIndex = linkedlist.lastIndexOf("Item4");
	     System.out.println("Last Occurrence: " + lastIndex);
	     
	     
	     // Create a LinkedList
	     LinkedList<String> list = new LinkedList<String>();
	  
	     // Add elements to LinkedList
	     list.add("Item1");
	     list.add("Item2");
	     list.add("Item3");
	     list.add("Item4");
	     list.add("Item5");
	     list.add("Item6");
	     list.add("Item7");
	  
	     // Displaying LinkedList elements
	     System.out.println("LinkedList elements:");
	     Iterator<String> it= list.iterator();
	     while(it.hasNext()){
	        System.out.println(it.next());
	     }
	  
	     // Obtaining Sublist from the LinkedList
	     List<String> sublist = list.subList(2,5);
	  
	     // Displaying SubList elements
	     System.out.println("\nSub List elements:");
	     Iterator<String> subit= sublist.iterator();
	     while(subit.hasNext()){
	        System.out.println(subit.next());
	     }
	  
	     /* Any changes made to Sub List will be reflected
	      * in the original List. Lets take this example - We
	      * are removing element "Item4" from sublist and it 
	      * should be removed from original list too. Observe 
	      * the Output of this part of the program.
	      */
	     sublist.remove("Item4");
	     System.out.println("\nLinkedList elements After remove:");
	     Iterator<String> it2= list.iterator();
	     while(it2.hasNext()){
	        System.out.println(it2.next());
	     }
	}

}
