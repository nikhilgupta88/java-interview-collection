package com.example.java_interview_collection.map.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	
		public static void main(String args[]) {

		      /* This is how to declare TreeMap */
		      TreeMap<Integer, String> tmap = 
		             new TreeMap<Integer, String>();

		      /*Adding elements to TreeMap*/
		      tmap.put(1, "Data1");
		      tmap.put(23, "Data2");
		      tmap.put(70, "Data3");
		      tmap.put(4, "Data4");
		      tmap.put(2, "Data5");

		      /* Display content using Iterator*/
		      Set<Entry<Integer, String>> set = tmap.entrySet();
		      Iterator<Entry<Integer, String>> iterator = set.iterator();
		      while(iterator.hasNext()) {
		         Map.Entry<Integer, String> mentry = (Map.Entry<Integer, String>)iterator.next();
		         System.out.print("key is: "+ mentry.getKey() + " & Value is: "+mentry.getValue());
		        
		      }

	}

}
