package com.example.java_interview_collection.collectionclass;

import java.util.ArrayList;
import java.util.Collections;

//A class to represent a student.
class Student {
	 int rollno;
	 String name, address;
	
	 // Constructor
	 public Student(int rollno, String name, String address) {
	     this.rollno = rollno;
	     this.name = name;
	     this.address = address;
	 }
	
	 // Used to print student details in main()
	 public String toString() {
	     return this.rollno + " " + this.name + " " + this.address;
	 }
}

	
//Driver class
public class TestSortUserDefinedClass {
	
	 public static void main (String[] args) {
	     ArrayList<Student> ar = new ArrayList<Student>();
	     
	     ar.add(new Student(111, "bbbb", "london"));
	     ar.add(new Student(131, "aaaa", "nyc"));
	     ar.add(new Student(121, "cccc", "jaipur"));
	
	     System.out.println("Unsorted : " + ar);
	     
	     Collections.sort(ar, new SortByRoll());
	
	     System.out.println("\nSorted by rollno : " +ar);
	    
	 }
}
