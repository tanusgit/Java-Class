package employeemultiadrs;

import java.util.ArrayList;
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

	public static void howManyEmployee() {
		System.out.print("How many employees: ");
		int input = sc.nextInt();
		ArrayList<Employee> emps = new ArrayList<>();
		for (int i = 0; i < input; i++) {
			Employee m = getEmployeeWithData();
			System.out.print("How many addresses ");
			int input2 = sc.nextInt();
			for (int j = 0; j < input2; j++) {
				m.getAddresses().add(getaddressWithData());

			}
			emps.add(m);

		}
		int count = 1;
		for (Employee e : emps) {
			System.out.println("**************showing employee" + count++ + "****************");

			e.display();
			int count2 = 1;

			for (Address a : e.getAddresses()) {
				System.out.println("############showing address" + count2++ + "#########");
				a.showAddress();
			}
		}

	}

	public static void showAddress(Address a) {
		System.out.println(a.getCity() + " " + a.getCountry() + " " + " " + a.getState() + " " + a.getHouseNo() + " "
				+ a.getStreetNo());
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
