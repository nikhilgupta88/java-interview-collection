package com.example.java_interview_collection.collectionclass;

import java.util.Comparator;

class SortByRoll implements Comparator<Student> {
	 
	 // Used for sorting in ascending order of
	 // roll number
	 public int compare(Student a, Student b) {
	     return a.rollno - b.rollno;
	 }
}
