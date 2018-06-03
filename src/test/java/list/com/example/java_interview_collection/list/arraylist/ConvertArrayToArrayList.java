package com.example.java_interview_collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
	public static void main(String[] args) {

		  /* Array Declaration and initialization*/
		  String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

		  /*Array to ArrayList conversion*/
		  ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));

		  /*Adding new elements to the converted List*/
		  citylist.add("New City2");
		  citylist.add("New City3");

		  /*Final ArrayList content display using for*/
		  System.out.print(citylist);
	      System.out.println();
	
		/*ArrayList to Array Conversion */
		String array[] = new String[citylist.size()];              
		for(int j =0;j<citylist.size();j++){
		  array[j] = citylist.get(j);
		}
	
		/*Displaying Array elements*/
		for(String k: array){
			System.out.print(" "+k);
		}
}
}
