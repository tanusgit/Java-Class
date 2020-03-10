package java8Lambda;

public class Test2 {
	interface Action {
		public String process(String name);
	}

	public static void main(String[] args) {

		Action a = (name) -> {
			return "Mr/Mrs " + name;
		};
		String data = a.process("Ram");
		System.out.println(data);
	}
}
