package com.example.java_interview_collection.fp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutFp {

	public static void main(String[] args) {
	    List<String> names = 
	      Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques","Nemo");
	 
	    findNemo(names);
	    findNemo1(names);
	   

	}                 
	   
	  public static void findNemo(List<String> names) {
	    boolean found = false;
	    for(String name : names) {
	      if(name.equals("Nemo")) {
	        found = true;
	        break;
	      }
	    }
	     
	    if(found)
	      System.out.println("Found Nemo");
	    else
	      System.out.println("Sorry, Nemo not found");
	  }
	   
	  public static void findNemo1(List<String> names) {
		  if(names.contains("Nemo"))
		    System.out.println("Found Nemo");
		  else
		    System.out.println("Sorry, Nemo not found");
		}
	  
}
