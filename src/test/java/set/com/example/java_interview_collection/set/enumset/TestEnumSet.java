package com.example.java_interview_collection.set.enumset;

import java.util.EnumSet;
import java.util.Set;

enum E{
	CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
}
enum days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  

public class TestEnumSet {

	public static void main(String[] args) {

		
		EnumSet<E> set1, set2, set3, set4, set5;
		set1 = EnumSet.of(E.QUIZ, E.CONTRIBUTE, E.LEARN, E.CODE);
        set2 = EnumSet.complementOf(set1);
        set3 = EnumSet.allOf(E.class);
        set4 = EnumSet.range(E.CODE, E.CONTRIBUTE);
        set5 = EnumSet.noneOf(E.class);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);
        System.out.println("Set 4: " + set4);
        System.out.println("Set 5: " + set5);
        
        
        Set<days> set = EnumSet.allOf(days.class);  
        System.out.println("Week Days:"+set);  
        Set<days> _set = EnumSet.noneOf(days.class);  
        System.out.println("Week Days:"+_set);     
        
	}

}
