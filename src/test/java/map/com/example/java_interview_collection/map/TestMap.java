package com.example.java_interview_collection.map;

import java.util.HashMap;
import java.util.Map;

import java.util.Set;

public class TestMap {

		public static void main(String[] args) {
	
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Mark");
		m.put(2, "Julie");
		m.put(3, "Conner");
		m.put(4, "David");
		m.put(5, "Steve");
		
		System.out.println("Map is : "+m);
		
		Map< String,Integer> hm = new HashMap< String,Integer>();
			hm.put("a", new Integer(100));
			hm.put("b", new Integer(200));
			hm.put("c", new Integer(300));
			hm.put("d", new Integer(400));
			System.out.println("Map is :" +hm);
			
			// Returns Set view     
			Set< Map.Entry<String, Integer>> st = hm.entrySet();   
			
			for (Map.Entry< String,Integer> me:st) {
				System.out.print(me.getKey()+":");
				System.out.println(me.getValue());
			}
			System.out.println(st);
	}

}
