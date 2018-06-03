package com.example.java_interview_collection.queue.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		// Creating empty priority queue
        PriorityQueue<String> pQueue =
                          new PriorityQueue<String>();
 
        // Adding items to the pQueue
        pQueue.add("C");
        pQueue.add("C++");
        pQueue.add("Java");
        pQueue.add("Python");
 
        System.out.println("PriorityQueue is : "+pQueue);
        // Printing the most priority element
        System.out.println("Head value using peek function : "+ pQueue.peek());
 
        // Printing all elements Using Iterator
        System.out.println("The queue elements:");
        Iterator<String> itr = pQueue.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
 
        // Removing the top priority element (or head) and
        // printing the modified pQueue
        System.out.println("Remove The Top Priority of Element :"+pQueue.poll());
        System.out.println("After removing an element with poll function:" + pQueue);
        
        // Removing Java
        System.out.println("after removing Java with remove function:"+pQueue.remove("Java"));
        
        
        // Check if an element is present
        System.out.println ( "Priority queue contains C or not?: " + pQueue.contains("C"));
 
        // get objects from the queue in an array and
        // print the array
        Object[] arr = pQueue.toArray();
        System.out.println ( "Value in array: ");
        for (int i = 0; i<arr.length; i++)
          System.out.print(arr[i].toString()+", ") ;
	}
}
