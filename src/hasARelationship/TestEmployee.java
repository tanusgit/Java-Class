package hasARelationship;

public class TestEmployee {
	
	public static void main(String[] args) {
		Address a = new Address("Bangalore", "India", "Karnataka", 1234, 
				53);
		Employee p1 = new Employee("Sila", 42, 2);
		p1.adrs = a;
		p1.show();
		//adrs is a
		p1.adrs.showAddress();
		
	}

}
