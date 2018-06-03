package com.example.java_interview_collection.set.linkedhashset;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		
		// LinkedHashSet of String Type
        LinkedHashSet<String> lhset = new LinkedHashSet<String>();

        // Adding elements to the LinkedHashSet
        lhset.add("Z");
        lhset.add("PQ");
        lhset.add("N");
        lhset.add("O");
        lhset.add("KK");
        lhset.add("FGH");
        System.out.println(lhset);

        // LinkedHashSet of Integer Type
        LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

        // Adding elements
        lhset2.add(99);
        lhset2.add(7);
        lhset2.add(0);
        lhset2.add(67);
        lhset2.add(89);
        lhset2.add(66);
        System.out.println(lhset2);
        
        //This will not add new element as A already exists 
        lhset2.add(7); 
        lhset2.add(0); 
        lhset2.add(null);
 
        System.out.println("Size of LinkedHashSet : " + lhset2.size());  
        System.out.println("Original LinkedHashSet:" + lhset2);  
        System.out.println("Removing 7 from LinkedHashSet: " + lhset2.remove(7));  
        System.out.println("Trying to Remove 55 which is not present: " + lhset2.remove(55));  
        System.out.println("Checking if 67 is present :" + lhset2.contains(67));
        System.out.println("Updated LinkedHashSet: " + lhset2);  
    
	}

}
