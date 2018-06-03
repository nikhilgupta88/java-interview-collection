package com.example.java_interview_collection.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(3); ints.add(5); ints.add(10);
		double sum = sum(ints);
		System.out.println("Sum of ints="+sum);
	}
	
	//Upper Bounded Wild card
	public static double sum(List<? extends Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
	
	/*
	 * public static double sum(List<Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
	*/
	
	//Unbounded Wild card
	public static void printData(List<?> list){
		for(Object obj : list){
			System.out.print(obj + "::");
		}
	}
	//Lower Bound Wild Card
	public static void addIntegers(List<? super Integer> list){
		list.add(new Integer(50));
	}
}