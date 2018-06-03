package com.example.java_interview_collection.map.enummap;

import java.util.EnumMap;

enum E
{
    CODE, CONTRIBUTE, QUIZ, MCQ;
}

public class TestEnumMap {
	
	public static void main(String args[]) {    
    // Java EnumMap Example 1: creating EnumMap in java with key 
    //as enum type STATE
    EnumMap<E, String> EMap = new EnumMap<E, String>(E.class);

    // Java EnumMap Example 2:
    // putting values inside EnumMap in Java
    // we are inserting Enum keys on different order than their natural order
    EMap.put(E.CODE, "Start Coding with E");
    EMap.put(E.CONTRIBUTE, "Contribute for others");
    EMap.put(E.QUIZ, "Practice Quizes");
    EMap.put(E.MCQ, "Test Speed with Mcqs");
     
    // printing size of EnumMap in java
    System.out.println("Size of EnumMap in java: " + EMap.size());
  
    // printing Java EnumMap , should print EnumMap in natural order
    // of enum keys (order on which they are declared)
    System.out.println("EnumMap: " + EMap);
  
    // retrieving value from EnumMap in java
    System.out.println("Key : " + E.CODE +" Value: "
                        + EMap.get(E.CODE));
  
    // checking if EnumMap contains a particular key
    System.out.println("Does EMap has :" + E.CONTRIBUTE + " : "
                        +  EMap.containsKey(E.CONTRIBUTE));
  
    // checking if EnumMap contains a particular value
    System.out.println("Does EMap has :" + E.QUIZ + " : "
                        + EMap.containsValue("Practice Quizes"));
    System.out.println("Does EMap has :" + E.QUIZ + " : "
                        + EMap.containsValue(null));

	}
}
