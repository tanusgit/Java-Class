package encapsulationAbstraction;

public class TestPerson {
	public static void main(String[] args) {
		// 1.create obj
		Person person = new Person();

		// assigning values
		person.setId(123); // person.id = 123;
		person.setName("user1");// person.name = "user1";
		person.setAge(28);
		person.setSal(11212);
		//we have now control on our code no one can change the fields directly.
		//we have use to setter()
		//we call it a pojo class which has setter() and getters() with some
		//instance variables
		// print values
		System.out.println(person.getId()); // person.id
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getSal());
	}
}
