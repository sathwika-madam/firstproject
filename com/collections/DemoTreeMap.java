package com.collections;
import java.util.TreeMap;
//Class Declaration
public class DemoTreeMap {
	//Main Method
	public static void main(String[] args) {
		//Initializing Objects for TreeMap
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		//Adding Students Roll number and Names
		tmap.put(1, "Sathwika");
		tmap.put(3, "Pallavi");
		tmap.put(5, "Srija");
		tmap.put(2, "Sandhya");
		tmap.put(4, "Mahi");
		tmap.put(6, "Shravya");
		//Accepting Null values 
		tmap.put(0, "null");
		//Accepting Negative Values
		tmap.put(-1, "Vishwasini");
		//Printing Tree Map values
		System.out.println(tmap);
		//Printing key values
		System.out.println(tmap.keySet());
		//Prints a Boolean Value
		System.out.println(tmap.isEmpty());	
		//Printing Size
		System.out.println(tmap.size());
		//Removing an Element
		System.out.println(tmap.remove(6,"Shravya"));
		//Printing Tree Map values
		System.out.println(tmap);
	}
}
