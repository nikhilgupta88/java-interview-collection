package com.example.java_interview_collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestHashMapSorting {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

        System.out.println("Before Sorting:"+hmap);
        
        Map<Integer, String> m = new TreeMap<Integer, String>(hmap);
        System.out.println("After Sorting"+m);
        
       
	}

}
