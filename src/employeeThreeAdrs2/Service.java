package employeeThreeAdrs2;

import java.util.Scanner;

public class Service {
	static Scanner sc = new Scanner(System.in);

	public static Employee getEmployeeWithData() {
		System.out.print("enter First name: ");
		String name = sc.next();
		System.out.print("enter last name: ");
		String lname = sc.next();
		System.out.println("enter id: ");
		int id = sc.nextInt();
		System.out.println("enter salary: ");
		int salary = sc.nextInt();
		Employee m = new Employee(id, name, salary, lname);
		return m;
	}

	public static Address getaddressWithData() {
		String res = " ";

		System.out.println("enter city: ");
		String city = sc.next();

		System.out.println("enter country: ");

		String country = sc.next();

		System.out.println("enter state: ");
		String state = sc.next();

		System.out.println("enter house no: ");

		int houseNo = sc.nextInt();

		System.out.println("enter streer no: ");

		int streetNo = sc.nextInt();
		
		Address a = new Address(city, country, state, houseNo, streetNo);
		return a;
	}

}
