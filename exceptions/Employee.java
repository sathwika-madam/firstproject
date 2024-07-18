package exceptions;
public class Employee {
	//Employee Class Variables
	String name;
	int salary;
	//Parameterized Constructor
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	void calculate() {
		float pf=salary*1000;
		salary+=pf;
		System.out.println("Salary:"+salary);
		
		
	}
}