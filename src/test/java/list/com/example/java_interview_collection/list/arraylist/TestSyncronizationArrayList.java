package com.example.java_interview_collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestSyncronizationArrayList {

	 public static void main(String a[]){
	    List<String> syncal = Collections.synchronizedList(new ArrayList<String>());
	   //Adding elements to synchronized ArrayList
       syncal.add("Pen");
       syncal.add("NoteBook");
       syncal.add("Ink");
       
       System.out.println("Iterating synchronized ArrayList:");
       synchronized(syncal) {
	       Iterator<String> iterator = syncal.iterator(); 
	       while (iterator.hasNext())
	          System.out.println(iterator.next());
	       }
       
       
       CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();

	       //Adding elements to synchronized ArrayList
	       al.add("Pen");
	       al.add("NoteBook");
	       al.add("Ink");

	       System.out.println("Displaying synchronized ArrayList Elements:");
	       //Synchronized block is not required in this method
	       Iterator<String> iterator = al.iterator(); 
	       while (iterator.hasNext())
	          System.out.println(iterator.next());
   }
}

