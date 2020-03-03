package generics;

public class Test2 {
	public static void main(String[] args) {
		// print char, int, string array using generics
		// Create arrays of Integer, Double and Character
				Integer[] intArray = { 1, 2, 3, 4, 5 };
				Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
				Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
				String[] strArray = { "hyd", "banglr", "chenai" };

				System.out.println("Array integerArray contains:");
				printArray(intArray); // pass an Integer array

				System.out.println("\nArray doubleArray contains:");
				printArray(doubleArray); // pass a Double array

				System.out.println("\nArray characterArray contains:");
				printArray(charArray); // pass a Character array
				//string array
				printArray(strArray);
		
	}

	public static <T> void printArray(T[] inputArray) {
		//data type of T can be identified in the run time
		for (T element : inputArray) {
			System.out.println(element);
		}
		System.out.println();
	}
}
