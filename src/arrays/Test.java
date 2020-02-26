package arrays;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] array = { 1, 5, 9, 2, 6, 8, 7, 7, 3, 4 };

		System.out.println("before sorting: " + Arrays.toString(array));
		Arrays.sort(array);

		System.out.println("after sorting: " + Arrays.toString(array));

		String[] array2 = { "A", "H", "F", "B", "D", "C", "R", "Z", "P", "W" };

		System.out.println("before sorting: " + Arrays.toString(array2));
		Arrays.sort(array2);

		System.out.println("after sorting: " + Arrays.toString(array2));

	}
}
