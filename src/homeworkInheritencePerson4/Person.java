package homeworkInheritencePerson4;

public class Person {

	int id;
	String name;
	int age;
	Address adrs;

	public Person(int id, String name, int age, Address adrs) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.adrs = adrs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAdrs() {
		return adrs;
	}

	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(adrs);
	}
}
