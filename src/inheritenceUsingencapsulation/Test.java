package inheritenceUsingencapsulation;

public class Test {
	public static void main(String[] args) {
		Employee m = new Employee();
		m.setName("Nil");
		m.setAge(45);
		m.setId(6);
		m.setPan("ki");
		m.setPfNo("jk");
		m.displayEmp();
		m.displayPerson();
		System.out.println("*********************************");
		Person p = new Person();
		p.setAge(81);
		p.setName("Rina");
		p.setId(5);
		p.displayPerson();
	}

}
