package com.collections;
//importing stack 
import java.util.Stack;
//class declaration
public class DemoStack {
	public static void main(String[] args) {
		//Initializing stack object
		Stack<Integer> s=new Stack<Integer>();
		//Inserting the elements into the Stack
		s.push(10);
		s.push(15);
		s.push(20);
		s.push(25);
		//printing Stack Elements
		System.out.println(s);
		//Printing Top most element of the stack
		System.out.println(s.peek());
		//Deleting an element from the stack
		System.out.println(s.pop());
		//printing Top most element
		System.out.println(s.peek());
		System.out.println(s);
		//To search an element from the stack
		System.out.println(s.search(20));
		//printing boolean value foe empty method
		System.out.println(s.empty());
		//printing first element from the stack
		System.out.println(s.firstElement());		
	}

}
