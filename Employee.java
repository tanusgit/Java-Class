package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	int id;
	String name;
	int salary;
	Scanner sc = new Scanner(System.in);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void display() {
		 System.out.println(name); 
		 System.out.println(id);
		 System.out.println(salary);
		 System.out.println(" ");
	}
	
	public void askUser() {
		System.out.println("enter name: ");
		name = sc.nextLine();
		System.out.println("enter id: ");
		id = sc.nextInt();
		System.out.println("enter salary: ");
		salary = sc.nextInt();
		
	}
	
	
	public static void main(String[] args) {
		Employee m = new Employee();
		m.askUser();
		m.display();
	}
		 
}
