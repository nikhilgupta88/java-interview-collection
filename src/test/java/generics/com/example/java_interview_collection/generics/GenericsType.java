package com.example.java_interview_collection.generics;

public class GenericsType<T> {
	
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		GenericsType<String> t =  new GenericsType<String>();
		t.set("Nikhil");
		String str = (String) t.get(); 
		System.out.println(str);

		TestGenericsTypeOld type =  new TestGenericsTypeOld();
		type.set("Pankaj");
		String str1 = (String) type.get(); 
		System.out.println(str1);
	}

}
