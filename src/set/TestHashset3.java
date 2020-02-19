package set;

import java.util.HashSet;
import java.util.Set;

public class TestHashset3 {
	public static void main(String[] args) {
		
			Set<Person> persons = new HashSet<>();

			Person p1 = new Person(123, "user5", 45);

			Person p2 = new Person(123, "user5", 45);
			
			Person p3 = new Person(123, "user5", 45);
//if objects are equal they have same hashcode
			System.out.println(p1.hashCode());
			System.out.println(p2.hashCode());
			System.out.println(p3.hashCode());
		}

}

