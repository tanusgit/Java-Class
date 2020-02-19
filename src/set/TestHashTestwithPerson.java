package set;

import java.util.Collections;
import java.util.HashSet;

public class TestHashTestwithPerson {
public static void main(String[] args) {
	Person p = new Person(1, "uma", 21);
	Person p1 = new Person(5, "Jhuma", 22);
	Person p2 = new Person(3, "Ruma", 26);
	Person p3 = new Person(4, "Nila", 22);
	Person p4 = new Person(4, "Nila", 22);
	Person p5 = new Person(4, "Nila", 22);
	HashSet<Person> persons = new HashSet<Person>();
	
	persons.add(p);
	persons.add(p1);
	persons.add(p2);
	persons.add(p3);
	persons.add(p4);
	persons.add(p5);
	
	for(Person h: persons) {
		System.out.println(h);
	}
}
}
