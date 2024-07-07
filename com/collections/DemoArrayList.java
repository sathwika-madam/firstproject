package com.collections;
import java.util.ArrayList;
import java.util.List;
//class declaration
public class DemoArrayList {
	public static void main(String[] args) {
		//Initializing ArrayList Objects
		ArrayList list=new ArrayList();
		//Inserting ArrayList Elements 
		list.add(10);
		list.add(20);
		list.add('a');
		list.add("java");
		list.add(3.14);
		//printing ArrayList
		System.out.println(list);
		//Adding element to the list
		list.add(1,2);
		System.out.println(list);
		//setting an element at an Index
		list.set(2,4);
		System.out.println(list);
		list.add(30);
		list.add('a');
		list.add(null);
		//printing ArrayList
		System.out.println(list);
		//printing the index of 'a'
		System.out.println(list.indexOf('a'));
		//get method
		System.out.println(list.get(0));
		//printing last index of array list
		System.out.println(list.lastIndexOf(20));
		//printing size of an array list
		System.out.println(list.size());
		//removing an element from the list
		System.out.println(list.remove(7));
		System.out.println(list);
		//using isEmply() and printing booelan value
		System.out.println(list.isEmpty());
		list.add("python");
		//printing ArrayList Elements
		System.out.println(list);
	}
}

