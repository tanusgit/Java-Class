package employeemultiadrs;

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

	public static Pair howManyEmployee() {
		Pair p = new Pair();
		Employee m = new Employee();
		Address a = new Address();
		System.out.print("How many employees: ");
		int input = sc.nextInt();
		System.out.print("How many addresses ");
		int input2 = sc.nextInt();
		for (int i = 0; i < input; i++) {
			m = getEmployeeWithData();
			for (int j = 0; j < input2; j++) {
				a = m.setPresentadrs(getaddressWithData());
			}
			p = new Pair(m, a);
		}
		return p;

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
