package com.collections;
import java.util.Vector;
public class DemoVector {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		
		v.add("Apple");
		v.add("Banana");
		v.add("Mango");
		System.out.println(v);
		v.add("Grapes");
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.add("Orange");
		v.set(4,"cherry");
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.isEmpty());
	}
}
