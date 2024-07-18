package exceptions;
//Inheriting the manager class from employee
public class Manager extends Employee {
	//declaring manager class variable
	String department;
	//constructor
	public Manager(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	void calculate() {
		float bonus=500;
		salary+=bonus;
		System.out.println("salary:"+salary);
		
	}
	public static void main(String[] args) {
		//Initializing object
		Manager m=new Manager("Sathwika",5000,"java");
		System.out.println("Details: Name:" +m.name+ ",Salary:"+m.salary+ ",Department:" +m.department);
		m.calculate();
		
	}

}
