package java8;

public interface Service {

	void process(String str);

	default void log(String str) {
		System.out.println("hello logging::" + str);
	}

	static void print(String str) {
		System.out.println("Printing " + str);
	}

}
