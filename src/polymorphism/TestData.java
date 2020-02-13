package polymorphism;

public class TestData {
	public static void main(String[] args) {
		Data d = new Data();
		Person p = new Person(5, "mina");
		d.save("welcome");
		d.save(p);
	}
	
	

	
}
