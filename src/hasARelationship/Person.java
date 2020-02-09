package hasARelationship;

public class Person {

	String name;
	int age;
	int id;
	//object as instance variable
	//composition or has-a relationship between classes
	Address adrs;
	Address permanent;
	public Person() {

	}

	public Person(String name, int age, int id, Address a) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		adrs = a;
	}

	public void show() {
		System.out.println(name + " " + age + " " + id);
	}
}
