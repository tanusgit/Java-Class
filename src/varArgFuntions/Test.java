package varArgFuntions;

public class Test {
	public static void main(String[] args) {
		System.out.println("------------display-----");
		display();
		display("hi");
		display("hi", "how");
		display("java programming", ".net", "c++");
	}

	public static void display(String... data) {
		for (String v : data) {
			System.out.println(v);
		}
	}

}
