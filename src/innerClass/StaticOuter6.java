package innerClass;

public class StaticOuter6 {
	static int data = 301;

	static class Inner {
		static void msg() {
			System.out.println("data is " + data);
		}
	}
  



public static void main(String args[]) {
		StaticOuter6.Inner.msg();// no need to create the instance of static nested
							// class
	}
}