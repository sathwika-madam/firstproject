package com.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Class Declaration
public class StudentCollection {
	public static void main(String[] args) {
		//creating list objects
		List<Student> list=new ArrayList<Student>();
		//printing a statement
		System.out.println("Students List:");
		//adding elements to the List
		list.add(new Student(101,"Sathwika","MCA"));
		list.add(new Student(102,"Pavani","Bsc"));
		list.add(new Student(103,"Akanksha","Btech"));
		list.add(new Student(104,"Vaishnavi","BscAr"));
		//creating student object
		Student s= new Student(105,"Dinesh","Btech");
		//adding student object to the list
		list.add(s);
		for(Student s1:list) {
			//printing Students List
			System.out.println(s1);
		}
		//Arranging the List elements in Alphabetical Order
		Collections.sort(list);
		System.out.println("After Sorting:");
		for(Student s1:list) {
			//printing after sorting
			System.out.println(s1);
		}
	}
}


