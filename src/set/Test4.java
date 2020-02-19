package set;

import java.util.HashSet;
import java.util.Set;

public class Test4 {
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<Person>();

		Person p1 = new Person(123, "user5", 45);
		persons.add(p1);

		Person p2 = new Person(123, "user5", 45);
		
		System.out.println(persons.contains(p1));
		System.out.println(persons.contains(p2));
		//contains() checks only if the content is same
	}

}
