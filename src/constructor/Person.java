package constructor;

public class Person {
	String name;
	int age;
	int id;

	public Person() {
		
	}
	
	
	public Person(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	

	/*public Person(String n, int a, int i) {
		name = n;
		age = a;
		id = i;
	}
	*/
	public void show() {
		System.out.println(name + " " + age + " " + id );
	}

}
