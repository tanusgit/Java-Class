package enum1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter color");
		String input = sc.next();

		boolean found = ColorType.isValidColor(input);
		if (found) {
			System.out.println("valid color");
		} else {
			System.out.println("invalid color");
		}

	}
}
