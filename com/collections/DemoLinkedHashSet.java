package com.collections;
import java.util.LinkedHashSet;
//Class Declaration
public class DemoLinkedHashSet {
	public static void main(String[] args) {
		//Initializing LinkedHashSet object
		LinkedHashSet<String> cities=new LinkedHashSet<String>();
		//Adding Elements
		cities.add("Hyderabad");
		cities.add("Banglore");
		cities.add("Chennai");
		cities.add("Pune");
		cities.add("Mumbai");
		System.out.println("Cities List are:"+cities);
		//Iterating over elements
		for(String c:cities) {
			System.out.println(c);
		}
		//Adding null value
		cities.add(null);
		//Adding Duplicate value
		cities.add("Hyderabad");
		//Printing List of cities
		System.out.println("Cities List are:"+cities);
		//prints a Boolean Value
		System.out.println(cities.contains("Hyderabad"));
		System.out.println(cities.contains("Delhi"));
	}
}
