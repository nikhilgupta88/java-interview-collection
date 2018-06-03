package com.example.java_interview_collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestGetSearch {

	 public static void main(String a[]){
	     ArrayList<String> al = new ArrayList<String>();

	     //Addition of elements in ArrayList
	     al.add("Steve");
	     al.add("Justin");
	     al.add("Ajeet");
	     al.add("John");
	     al.add("Arnold");
	     al.add("Chaitanya");

	     System.out.println("Original ArrayList Content: "+al);

	     //Sublist to ArrayList
	     ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
	     System.out.println("SubList stored in ArrayList: "+al2);

	     //Sublist to List
	     List<String> list = al.subList(1, 4);
	     System.out.println("SubList stored in List: "+list);
	     
	     
	     //ArrayList of Integer Type
	      ArrayList<Integer> all = new ArrayList<Integer>();
	      all.add(1);
	      all.add(88);
	      all.add(9);
	      all.add(17);
	      all.add(17);
	      all.add(9);
	      all.add(17);
	      all.add(91);
	      all.add(27);
	      all.add(1);
	      all.add(17);
	      
	      System.out.println("Index of '1': "+all.indexOf(1));
	      System.out.println("Index of '9': "+all.indexOf(9));
	      System.out.println("Index of '17': "+all.indexOf(17));
	      System.out.println("Index of '91': "+all.indexOf(91));
	  
	      System.out.println("Last occurrence of element 1: "+all.lastIndexOf(1));
	      System.out.println("Last occurrence of element 9: "+all.lastIndexOf(9));
	      System.out.println("Last occurrence of element 17: "+all.lastIndexOf(17));
	      System.out.println("Last occurrence of element 91: "+all.lastIndexOf(91));
	      System.out.println("Last occurrence of element 88: "+all.lastIndexOf(88));
	      // Get element from arraylist
	      System.out.println("First element of the ArrayList: "+all.get(0));
	       System.out.println("Third element of the ArrayList: "+all.get(2));
	       System.out.println("Sixth element of the ArrayList: "+all.get(5));
	       System.out.println("Fourth element of the ArrayList: "+all.get(3));
	       // check whether element exist in array list or not 
	       System.out.println("'1' is present in arraylist: "+all.contains(1));
	       System.out.println("'55' is present in arraylist: "+all.contains(55));
	       System.out.println("'44' is there in arraylist: "+all.contains(44));
	       System.out.println("'7' is there in arraylist: "+all.contains(17));
	  }
	}