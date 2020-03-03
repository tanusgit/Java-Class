package generics;

public class Test {
	public static void main(String[] args) {

		print(1);
		print("hello");
		print('h');
		print(12.242424f);
		print(1141414141414144141l);
		print(2424242.242424244242d);
	}

	

	public static <E> void print(E data) {// can be called by passing any datatype, ex: int, string, float..etc..

		System.out.println(data);
	}
}
