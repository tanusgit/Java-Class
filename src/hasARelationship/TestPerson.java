package hasARelationship;

public class TestPerson {
	public static void main(String[] args) {
		Address a = new Address("Bangalore", "India", "Karnataka", 1234, 
				53);
		Person p1 = new Person("Sila", 42, 2, a );
		p1.show();
		//adrs is a
		p1.adrs.showAddress();
	}

}
