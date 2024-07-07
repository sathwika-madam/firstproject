package com.collections;
public class Student implements Comparable<Student>{
	//Declaring Variables
	int studentId;
	String studentName;
	String qualification;
	//Creating a constructor
	public Student(int studentId,String studentName, String qualification) {
		super();
		this.studentId=studentId;
		this.studentName=studentName;
		this.qualification=qualification;
	}
	
	@Override
	public String toString() {
		return "Student [Id="+studentId+",Name="+studentName+",qualification="+qualification+"]";
	}
	@Override
	//comparing string name
	//Implementing Comparable Interface
	public int compareTo(Student o) {
					if(this.studentName.compareTo(o.studentName)>0)
						return 1;
					else if(this.studentName.compareTo(o.studentName)<0)
						return -1;
					else
		               return 0;
	}
}


