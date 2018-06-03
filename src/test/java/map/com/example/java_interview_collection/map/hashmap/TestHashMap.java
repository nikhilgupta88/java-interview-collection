package com.example.java_interview_collection.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		
			/* Create a HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	      System.out.println("Is HashMap Empty? "+ hmap.isEmpty());
	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      System.out.println("Is HashMap Empty? "+ hmap.isEmpty());
	      System.out.println("HashMap is : " +hmap);
	      
	      /* Display content using Iterator*/
	      //set view of HashMap
	      Set< Map.Entry<Integer, String>> set = hmap.entrySet();
	      Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry<Integer, String> mentry = iterator.next();
	         System.out.println("key is: "+ mentry.getKey() + " & Value is: "+mentry.getValue());
	      }

	      /* Get values based on key*/
	      String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);

	      /* Remove values based on key*/
	    
	      System.out.println("Map key and values after removal:"+  hmap.remove(3));
	      
	      Iterator<Map.Entry<Integer, String>> iterator1 = hmap.entrySet().iterator();
	      while(iterator1.hasNext()) {
	         Map.Entry<Integer, String> mentry = iterator1.next();
	         System.out.println("key is: "+ mentry.getKey() + " & Value is: "+mentry.getValue());
	      }
	  
	      // Checking Key Existence
	      System.out.println("Key 7 exists in HashMap? : " +hmap.containsKey(7));
	   // Checking Value Existence
	      System.out.println("Key anuj exists in HashMap? : " +hmap.containsValue("Ajeet"));
	      
	      hmap.clear();
	      System.out.println("After clear : "+hmap);
	}

}
