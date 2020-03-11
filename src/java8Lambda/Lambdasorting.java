package java8Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambdasorting {
	public static void main(String[] args) {

		// sorting object array
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "Murali", 25, 10000));
		empList.add(new Employee(50, "Arun", 29, 20000));
		empList.add(new Employee(6, "Lakshman", 35, 5000));
		empList.add(new Employee(7, "Lalith", 32, 50000));

		System.out.println("before :");
		show(empList);
		System.out.println("\n\nsorting based on id:------");
		Collections.sort(empList);
		show(empList);

		System.out.println("\n\nsorting based on name:------");
		Comparator<Employee> aComparator = (e1, e2) -> e1.getName()
				.compareTo(e2.getName());
		Collections.sort(empList, aComparator);
		show(empList);

		System.out.println("based on age");
		Comparator<Employee> c = (c2, c1) -> c2.getAge()-c1.getAge();
		Collections.sort(empList, c);
		show(empList);
		System.out.println("based on salary");
		Comparator<Employee> d = (d1, d2) -> (int)(d1.getSalary() - d2.getSalary());
		Collections.sort(empList, d);
		show(empList);
	}

	private static void show(List<Employee> empList) {
		System.out.println("\n");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}
}
