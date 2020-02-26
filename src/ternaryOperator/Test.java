package ternaryOperator;

public class Test {
	public static void main(String[] args) {
		int age = 1;
		if (validage(age)) {
			System.out.println("valid age");
		} else {
			System.out.println("invalid age");
		}
	}

	private static boolean validage(int age) {
		return age > 18 ? true: false;
		
		/*if (age > 18) {
			return true;
		}
		return false;*/
	}

}
