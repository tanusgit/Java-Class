package collectionsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeAllSort {
//to sort on all the instance varibales we need comparator 
	
	//1.create the child class that implements comparator
	//2.override the compare()
	//3. create the child object
	//4. Collections.sort(empList,comparatorObj);
	//comparatorObj is the child object
	

	public static void main(String[] args) {
		// sorting object array
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "Murali", 25, 10000));
		empList.add(new Employee(50, "Anil", 29, 20000));
		empList.add(new Employee(6, "lakshman", 35, 5000));
		empList.add(new Employee(7, "Tanu", 32, 50000));

		 
		 // sorting by id employees array using Comparable interface
		System.out.println("before :");
		show(empList);
		System.out.println("\n\nsorting based on id:------");
		Collections.sort(empList);
		show(empList);
		 
		System.out.println("\n\nsorting based on name:------");
		  Comparator<Employee> aComparator = new Comparator<Employee>() {
		        @Override
		        public int compare(Employee e1, Employee e2) {
		            return e1.getName().compareTo(e2.getName());
		        }
		    };
		Collections.sort(empList,aComparator);
		show(empList);
		
		
		 

	}

	private static void show(List<Employee> empList) {
		System.out.println("\n");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}
}

	
	

