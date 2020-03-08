package collectionsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "manju", 25, 10000));
		empList.add(new Employee(50, "arun", 29, 20000));
		empList.add(new Employee(6, "laxman", 35, 5000));
		empList.add(new Employee(7, "shyam", 32, 50000));

		 
		System.out.println("before :");
		show(empList);
		//employee needs to implement comparable interface we need comparable only for
		//sorting
		//implements comparable interface and override compareto()
		Collections.sort(empList);
		System.out.println("after :");
		show(empList);
		 
	}

	private static void show(List<Employee> empList) {
		System.out.println("\n");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}
}
