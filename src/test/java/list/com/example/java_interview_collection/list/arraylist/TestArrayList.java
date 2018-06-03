package com.example.java_interview_collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {

        //ArrayList<String> Declaration
        ArrayList<String> al= new ArrayList<String>();
        //add method for String ArrayList
        al.add("Ram");
        al.add("Shyam");
        al.add("CPS");
        al.add("John");
        al.add("Steve");
        System.out.println("Elements of ArrayList of String Type: "+al);
        //adding element to the 4th position
        al.add(3,"Howdy");
        System.out.println("Elements after adding string Howdy:"+ al);
        //adding string to 1st position
        al.add(0, "Bye");
        //Print
        System.out.println("Elements after adding string bye:"+ al);
        //Removing element Ram from the arraylist
        al.remove("Ram");
        System.out.println("Elements after removing string ram:"+ al);
        //Removing 3rd element from the remaining list
        al.remove(2);
        System.out.println("Elements after removing from index 2:"+ al);
        
        //ArrayList 2 
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Text1");
        al2.add("Text2");
        al2.add("Text3");
        al2.add("Text4");

        //Adding ArrayList2 into ArrayList1
        al.addAll(al2);
        System.out.println("ArrayList1 after addAll:"+al);
        
        ArrayList<String> all = new ArrayList<String>();

        //Adding elements to the ArrayList
        all.add("Text 1");
        all.add("Text 2");
        all.add("Text 3");

        System.out.println("ArrayList Elements are: "+al);

        //Adding elements to a List
        List<String> list = new ArrayList<String>();
        list.add("Text 4");
        list.add("Text 5");
        list.add("Text 6");

        //Adding all elements of list to ArrayList using addAll
        all.addAll(list);
        System.out.println("Updated ArrayList Elements: "+al);
        
     // ArrayList 3 
        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("Apple");
        al3.add("Orange");
        al3.add("Grapes");
        al3.add("Mango");
        System.out.println("ArrayList1 before addAll:"+al3);

        //ArrayList 4
        ArrayList<String> al4 = new ArrayList<String>();
        al4.add("Fig");
        al4.add("Pear");
        al4.add("Banana");
        al4.add("Guava");
        System.out.println("ArrayList2 content:"+al4);

        //Adding ArrayList4 in ArrayList3 at 3rd position(index =2)
        al3.addAll(2, al4);
        System.out.println("ArrayList1 after adding ArrayList2 at 3rd Pos:\n"+al);
    }
}
