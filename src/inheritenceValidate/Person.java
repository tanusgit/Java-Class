package inheritenceValidate;

import java.util.Scanner;

//id name age
//pf pan extend person
//contact id contact period ext employee
//input validate print 
//validation: id should be positive
//name should be min 10 characters
//age 18-60
//pan exact 13 out of which 2 of them is numbers
//pf 4ch-4ch-4ch
//contract id string begins with C_ or P_
//contract period 6-24
public class Person {
	int id = 0;
	String name = "";
	int age = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public Person() {
		super();
		setId();
		setAge();
		setName();
	}
	
	public int getId() {
		return id;
	}
	public void setId() {
		System.out.println("enter id: ");
		int id = sc.nextInt();
		if (id >= 0) {
			this.id = id;
		}
		else {
		System.out.println("Wrong input");
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName() {
		int min = 10;
		System.out.println("enter name: ");
		String name = sc.next();
		if (name.length() >= min) {
			this.name = name;
		}
		else {
		System.out.println("Wrong input");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		System.out.println("enter age: ");
		int age = sc.nextInt();
		if (age > 17 && age < 60) {
			this.age = age;
		}
		else {
		System.out.println("Wrong input");
		}
	}
	
	public void show() {
		System.out.println(getName() + " " + getAge() + " " + getId());
	}
	

}
