package com.collections;
import java.util.Stack;
//class declaration
public class LiteracyCities {
	//main method
	public static void main(String[] args) {
		//Initializing stack object
		Stack<String> s=new Stack<String>();
		//Inserting the elements into the Stack
		s.push("Delhi");
		s.push("Mumbai");
		s.push("Hyderabad");
		s.push("Pune");
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
		System.out.println(s.search("Delhi"));
		//printing boolean value foe empty method
		System.out.println(s.empty());
		s.push("Pune");
		s.push("Banglore");
		//printing Cities based on Literacy rate
		System.out.println("Cities based on Literacy Percentage:");
		System.out.println(s);
	}

}
