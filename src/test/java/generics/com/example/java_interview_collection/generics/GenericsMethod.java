package com.example.java_interview_collection.generics;

public class GenericsMethod {
	//Java Generic Method
		public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
			return g1.get().equals(g2.get());
		}
		
	public static void main(String[] args) {
		GenericsType<String> g1 = new GenericsType<String>();
		g1.set("Pankaj");
		
		GenericsType<String> g2 = new GenericsType<String>();
		g2.set("Pankaj");
		
		boolean isEqual = GenericsMethod.<String>isEqual(g1, g2);
		
		boolean isEqual1 = GenericsMethod.isEqual(g1, g2);
		
		System.out.println(isEqual);
		System.out.println(isEqual);
	}

}
