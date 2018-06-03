package com.example.java_interview_collection.list.vector;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		// Step 1: Create a Vector
	    Vector<String> vector = new Vector<String>();
	    
	    // Step 2: Add elements
	    vector.add("Item1");
	    vector.add("Item2");
	    vector.add("Item3");
	    vector.add("Item4");
	    vector.add("Item5");
	    vector.add("Item6");
	    /* The method subList(int fromIndex, int toIndex) 
	     * returns a List having elements of Vector 
	     * starting from index fromIndex 
	     * to (toIndex - 1).
	     */
	    List<String> subList = vector.subList(2,5);
	 
	    System.out.println("Sub list elements :" + subList);
	    /*for(int i=0; i < subList.size() ; i++){
	       System.out.print(" "+subList.get(i));
	    }
*/	    System.out.println();
	    
	    // Create a Vector
	    Vector<String> v = new Vector<String>();
	 
	    //Add elements to Vector
	    v.add("Walter");
	    v.add("Anna");
	    v.add("Hank");
	    v.add("Flynn");
	    v.add("Tom");
	 
	    // By Default Vector maintains the insertion order
	    System.out.println("Vector elements before sorting: " +v);
/*	    for(int i=0; i < v.size(); i++){
	       //get(i) method fetches the element from index i
	       System.out.print(" "+v.get(i));
	    }
*/	    System.out.println();
	    // Collection.sort() sorts the collection in ascending order
	    Collections.sort(v);
	 
	    //Display Vector elements after sorting using Collection.sort
	    System.out.println("Vector elements after sorting: "+v);
	   /* for(int i=0; i < v.size(); i++){
	       System.out.print(" "+v.get(i));
	    }*/
	    
	    
	    //Copying all the elements of Vector va to Vector vb
	       Collections.copy(vector, v);
	       System.out.print("After copying v into vector: "+vector);
	}
}
