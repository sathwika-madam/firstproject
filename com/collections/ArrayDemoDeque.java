package com.collections;
import java.util.ArrayDeque;
//Class Declaration
public class ArrayDemoDeque {
	//Initializing objects for DequeQueue
	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<String>();
		//Adding elements to the Queue
		ad.add("Sathwika");
		ad.add("Akanksha");
		ad.add("Pramod");
		ad.add("Praveen");
		//printing queue elements
		System.out.println(ad);
		//printing top elements from the queue
		System.out.println(ad.peek());
		//deleting element from the queue
		System.out.println(ad.poll());
		System.out.println(ad);
		ad.add("Dhanasree");
		ad.addFirst("Raju");
		ad.addLast("Hitansh");
		//printing queue elements
		System.out.println(ad);
	}
}
