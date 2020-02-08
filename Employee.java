package stat;

public class Employee {
	int id;
	String name;
	int salary;
	static int count = 6000;
	// take name and salary as input
	// create id automatically starting from 6000

	// param arg constructor
	public Employee(int sal, String name) {
		id = count++;
		this.salary = sal;
		this.name = name;
	}

	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}

}
