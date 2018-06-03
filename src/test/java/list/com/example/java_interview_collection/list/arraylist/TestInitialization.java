package com.example.java_interview_collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestInitialization {

	public static void main (String[] args) {
		// Create a array list way 4
		ArrayList<Integer> al = new ArrayList<Integer>(5);
		System.out.println(al.size());
		for(int i = 0; i < 10; i++) {
			al.add(i);
		}
		System.out.println(al.size());
		
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		for(int a : al) {
			System.out.print(" "+a);
		}
		System.out.println();
		//Array List initialization way 1

		ArrayList<Integer> al1 = new ArrayList<Integer>(
				Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.print(al1);
		System.out.println();
		
		//Array List initialization way 2
		ArrayList<Integer> al2 = new ArrayList<Integer>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
			for(int i = 0; i < 10; i++) {
				add(i);
			}
		}};
		System.out.print(al2);
				System.out.println();
				
		//Array List initialization way 3
		ArrayList<Integer> al3 = new ArrayList<Integer>(Collections.nCopies(10, 5));
		System.out.print(al3);
		
	}
}
