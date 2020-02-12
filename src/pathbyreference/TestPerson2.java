package pathbyreference;

public class TestPerson2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.id = 2001;
		p1.name = "user1";
		p1.age = 29;

		System.out.println("********showing p1********");
		p1.display();
		//new object is not created, p1 and p2 have the same address in the memory
		Person p2 = p1;
		System.out.println("********showing p2********");
		p2.display();

		p2.id = 4000;
		p2.name = "user11";
		p2.age = 45;

		System.out.println("********showing p1********");
		p1.display();
		System.out.println("********showing p2********");
		p2.display();

	}

}
