package collectionsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class COmparewithoutananymous implements Comparator<Employee>{
	
//old style without ananymous
		@Override
		public int compare(Employee e1, Employee e2) {
			return (e1.getName() .compareTo(e2.getName()));
		}
	}
class EmpAgeComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee e1, Employee e2) {
			return (int) (e1.getAge() - e2.getAge());
		}
	}


class EmpListSort3 {
		public static void main(String[] args) {
			// sorting object array
			List<Employee> empList = new ArrayList<Employee>();
			empList.add(new Employee(10, "Murali", 25, 10000));
			empList.add(new Employee(50, "Arun", 29, 20000));
			empList.add(new Employee(6, "lakshman", 35, 5000));
			empList.add(new Employee(7, "lalith", 32, 50000));

			
			System.out.println("\n\nsorting based on name:------");
		// Collections.sort(empList,new EmpNameComparator());
			show(empList);
			 

			System.out.println("\n\nsorting based on age:------");
		 Collections.sort(empList,new EmpAgeComparator());
			show(empList);
			 

		}

		private static void show(List<Employee> empList) {
			System.out.println("\n");
			for (Employee emp : empList) {
				System.out.println(emp);
			}
		}
	}



