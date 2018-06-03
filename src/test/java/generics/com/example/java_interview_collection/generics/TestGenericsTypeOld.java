package com.example.java_interview_collection.generics;

public class TestGenericsTypeOld {
	
	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		TestGenericsTypeOld t =  new TestGenericsTypeOld();
		t.set("Nikhil");
		String str = (String) t.get(); 
		System.out.println(str);

	}

}
