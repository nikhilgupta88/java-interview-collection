package com.example.java_interview_collection.generics;

public class GenericInheritence {

		public static void main(String[] args) {
			String str = "abc";
			Object obj = new Object();
			obj=str; // works because String is-a Object, inheritance in java
			
			MyClass<String> myClass1 = new MyClass<String>();
			MyClass<Object> myClass2 = new MyClass<Object>();
			//myClass2 = myClass1; // compilation error since MyClass<String> 
									//is not a MyClass<Object>
			obj = myClass1; // MyClass<T> parent is Object
			obj = myClass2; 
		}
		
		public static class MyClass<T>{}	// TODO Auto-generated method stub

	

}
