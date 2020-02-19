package set;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetTest2 {
	public static void main(String[] args) {
		input();
	}

	static Scanner sc = new Scanner(System.in);
	static HashSet<String> names = new HashSet<>();

	public static void input() {
		while (true) {
			System.out.println("enter name");
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("end")) {
				break;
			}
			names.add(input);
		}
		for (String n : names) {
			System.out.println(n);

		}
	}
}
