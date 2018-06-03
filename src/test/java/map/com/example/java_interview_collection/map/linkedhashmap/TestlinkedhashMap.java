package com.example.java_interview_collection.map.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestlinkedhashMap {

	public static void main(String[] args) {
		// LinkedHashMap Declaration
        LinkedHashMap<Integer, String> lhmap = 
                new LinkedHashMap<Integer, String>();

        //Adding elements to LinkedHashMap
        lhmap.put(22, "Abey");
        lhmap.put(33, "Dawn");
        lhmap.put(1, "Sherry");
        lhmap.put(2, "Karon");
        lhmap.put(100, "Jim");

        // Generating a Set of entries
        Set<Entry<Integer, String>> set = lhmap.entrySet();

        // Displaying elements of LinkedHashMap
        Iterator<Entry<Integer, String>> iterator = set.iterator();
        while(iterator.hasNext()) {
           Map.Entry<Integer, String> me = (Entry<Integer, String>)iterator.next();
           System.out.print("Key is: "+ me.getKey() + 
                   "& Value is: "+me.getValue()+"\n");
        }
        
        System.out.println("Getting value for key 1: " + lhmap.get(1));
        System.out.println("Size of the map: " + lhmap.size());
        System.out.println("Is map empty? " + lhmap.isEmpty());
        System.out.println("Contains key 2? "+ lhmap.containsKey(2));
        System.out.println("Contains value 'practice.geeksforgeeks.org'? "
                           + lhmap.containsValue("practice.geeksforgeeks.org"));
        System.out.println("delete element 1: " + lhmap.remove(1));
        System.out.println(lhmap);
	}
}
