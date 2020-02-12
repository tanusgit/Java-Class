package pathbyreference;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.id = 2001;
		p1.name = "user1";
		p1.age = 29;

		p1.display();
//function modifies the object and the object gets modified completely
		modify(p1);
		p1.display();

	}

	private static void modify(Person p2) {
		p2.id = 4000;
		p2.name = "user11";
		p2.age = 45;
	}

}
