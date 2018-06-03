package com.example.java_interview_collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LikesdListAddRemove {
	public static void main(String[] args) {

	     // create a LinkedList
	     LinkedList<String> list = new LinkedList<String>();

	     // Adding elements to the LinkedList
	    
	     list.add("Delhi");
	     list.add("Agra");
	     list.add("Mysore");
	     list.add("Chennai");
	     list.add("Pune");
	     list.add("Jaipur");
	     list.add("Kolkata");
	     list.add("Mumbai");
	     
	  
	     // Adding new Element at 6th Position 
	     list.add(5, "NEW ELEMENT");
	     // Displaying LinkedList elements
	     System.out.println("LinkedList elements: "+list);
	   //Adding an element at the beginning 
	     list.addFirst("FIRST");
	  
	     //Displaying the List after addition
	     System.out.println(list);
	  
	     //Adding an element at the end of list 
	     list.addLast("LAST");
	  
	     //Displaying the final list
	     System.out.println(list);
	     // Adding element to front of LinkedList
	     /* public boolean offerFirst(E e): Inserts the 
	      * specified element at the front of this list.
	      */
	     list.offerFirst("NEW Element");

	     // Displaying List after adding element
	     System.out.println("LinkedList After Addition:"+list);
	     
	     // Removing First element
	     Object firstElement = list.removeFirst();
	     System.out.println("Element removed: "+ firstElement);
	  
	     // Removing last Element
	     Object lastElement = list.removeLast();
	     System.out.println("Element removed: "+ lastElement);
	     
	     System.out.println("List Elements after Remove:"+list);
	     // Removing 3rd element
	     Object e1 = list.remove(2);
	     System.out.println("\nElement "+ e1 + " removed from the list\n");
	     
	     System.out.println("\nList Elements after Remove:"+list);
	  // Removing "Item4" from the list
	     list.remove("Delhi");

	     // LinkedList elements after remove
	     System.out.println("\nAfter Remove:"+list);
	  // Removing all the elements from LinkedList
	     list.clear();
	  
	     // LinkedList elements after remove
	     System.out.println("After clear():"+list);
	     
	     
	  // create a LinkedList
	     LinkedList<String> list1 = new LinkedList<String>();

	     // Add elements to the LinkedList
	     list1.add("AA");
	     list1.add("BB");
	     list1.add("CC");
	     list1.add("DD");

	     // Displaying linked list before add
	     System.out.println("Before: LinkedList: " + list1);

	     // create a new list having few elements
	     List<String> arrayList = new ArrayList<String>();
	     arrayList.add("Item1");
	     arrayList.add("Item2");
	     arrayList.add("Item3");

	     // Append the list elements to LinkedList
	     list1.addAll(arrayList);

	     // Displaying the LinkedList after addAll
	     System.out.println("After: LinkedList: " + list1);
	}
}
