package employeeThreeAdrs2;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	private int id;
	String name;
	int salary;
	String lname;
	Address presentadrs;
	Address Officeadrs;
	Address permanentadrs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getlName() {
		return lname;
	}

	public void setlName(String name) {
		this.lname = name;
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
		 System.out.println(lname); 
		 System.out.println(id);
		 System.out.println(salary);
		 System.out.println(" ");
	}

	public Employee(int id, String name, int salary, String lname) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.lname = lname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Address getPresentadrs() {
		return presentadrs;
	}

	public void setPresentadrs(Address presentadrs) {
		this.presentadrs = presentadrs;
	}

	public Address getOfficeadrs() {
		return Officeadrs;
	}

	public void setOfficeadrs(Address officeadrs) {
		Officeadrs = officeadrs;
	}

	public Address getPermanentadrs() {
		return permanentadrs;
	}

	public void setPermanentadrs(Address permanentadrs) {
		this.permanentadrs = permanentadrs;
	}
	

		 
}
