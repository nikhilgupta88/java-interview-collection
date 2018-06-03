package com.example.java_interview_collection.collectionclass;

import java.util.ArrayList;
import java.util.Collections;

public class TestFrequencyUserDefined {

	public static void main(String[] args) {
		// Let us create a list of Student type
        ArrayList<StudentNew> list =
                        new ArrayList<StudentNew>();
        list.add(new StudentNew("Ram", 19));
        list.add(new StudentNew("Ashok", 20));
        list.add(new StudentNew("Ram", 19));
        list.add(new StudentNew("Ashok", 19));
        
        // count the frequency of the word "code"
        System.out.println("The frequency of the Student Ram, 19 is: "+ 
                                Collections.frequency(list, new StudentNew("Ram", 19))); 

	}

}
class StudentNew
{
    private String name;
    private int age;
     
    StudentNew(String name, int age)
    {
    this.name=name;
    this.age=age;
    }
     
    public String getName()
    {
        return name;
    }
     
    public void setName(String name)
    {
        this.name = name;
    }
 
    public int getAge() 
    {
        return age;
    }
     
    public void setAge(int age)
    {
        this.age = age;
    }
     
    @Override
    public boolean equals(Object o)
    {
    	StudentNew s;
        if(!(o instanceof StudentNew))
        {
            return false;
        }
         
        else
        {
            s=(StudentNew)o;
            if(this.name.equals(s.getName()) && this.age == s.getAge())
            {
                return true;
            }
        }
        return false;
    }
}
