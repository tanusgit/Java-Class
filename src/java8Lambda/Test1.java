package java8Lambda;

public class Test1 {
	interface Controller {
		public void access(String name);
	}

	public static void main(String[] args) {
		// input argument
		Controller c = (String name) -> {
			System.out.println("Accessing method " + name);

		};
		c.access("ok");

		Controller c1 = (String name2) -> {
			System.out.println(name2.toUpperCase());
		};
		c1.access("Spring");

		Controller c2 = (String name) -> {
			System.out.println(name.toLowerCase());
		};
		c2.access("KIRAN");
		
		Controller c3 = ( name) -> {
			System.out.println(name.toLowerCase());
		};
		c3.access("KIRAN");
		
		Controller c4 = ( name) -> System.out.println(name.toLowerCase());
		c4.access("KIRAN");
	}

}
