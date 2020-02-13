package compareobject;

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.id = 1000;
		p1.name = "user1";
		p1.age = 30;

		Person p2 = new Person();
		p2.id = 1000;
		p2.name = "user1";
		p2.age = 30;
//== compares the addresses of the object. not useful for comparing two objects
//.equals also gives the address of the object.
		if (p1.equals(p2)) {
			System.out.println("objs are equal");
		} else {
			System.out.println("objs not equal");
		}
}

}
