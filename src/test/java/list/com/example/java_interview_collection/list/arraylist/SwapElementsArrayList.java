package com.example.java_interview_collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElementsArrayList {
		 public static void main(String a[]){
		    ArrayList<String> al = new ArrayList<String>();
		    al.add("Sachin");
		    al.add("Rahul");
		    al.add("Saurav");
		    al.add("Sunil");
		    al.add("Kapil");
		    al.add("Vinod");

		    System.out.println("ArrayList before Swap:"+al);

		    //Swapping 2nd(index 1) element with the 5th(index 4) element
		    Collections.swap(al, 1, 4);

		    System.out.println("ArrayList after swap:"+al);
		    
		  }
}
