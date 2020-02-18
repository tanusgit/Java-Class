package homeworkInheritencePerson4;

public class TestEmployee {
	public static void main(String[] args) {
		Address a = new Address("Hyderabad", "India", "Telengana", 2, 3);
		Address a1 = new Address("Bangalore", "India", "Karnataka", 21, 33);
		Person p = new Person(2, "Mina", 24, a);
		p.display();
		System.out.println("*********************************************");
		Employee m = new Employee(1, "nil", 26, a1, "pf", "pan");
		m.display();

	}

}
