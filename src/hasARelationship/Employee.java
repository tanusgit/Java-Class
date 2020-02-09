package hasARelationship;

public class Employee {

	String name;
	int age;
	int id;
	Address adrs;

	public Employee() {

	}

	public Employee(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;

	}

	public void show() {
		System.out.println(name + " " + age + " " + id);
	}

}
