package com.example.java_interview_collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedListToArrayList {
	public static void main(String[] args) {
	    LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Harry");
	    linkedlist.add("Jack");
	    linkedlist.add("Tim");
	    linkedlist.add("Rick");
	    linkedlist.add("Rock");
	    
	    // Converting Linkedlist to Array List
	    List<String> list = new ArrayList<String>(linkedlist);
	    System.out.println(list);
	    
	  //Converting LinkedList to Array
	    String[] array = linkedlist.toArray(new String[linkedlist.size()]);

	    //Displaying Array content
	    System.out.println("Array Elements:");
	    for(String s : array) {
		    System.out.print(" "+s);
	    }
	 }
}
