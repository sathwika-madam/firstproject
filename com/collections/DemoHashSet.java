package com.collections;
import java.util.HashSet;
public class DemoHashSet {
	public static void main(String[] args) {
		HashSet<String> coursenames=new HashSet<String>();
		coursenames.add("Java");
		coursenames.add("C++");
		coursenames.add("Python");
		coursenames.add("AWS");
		//Iterating over elements
		for(String s:coursenames)
		  System.out.println(s);
		coursenames.add("Java");
		coursenames.add(null);
		coursenames.add(null);
		coursenames.remove("AWS");
		 System.out.println(coursenames);
		coursenames.clear();
    	 System.out.println(coursenames);


	}
}
