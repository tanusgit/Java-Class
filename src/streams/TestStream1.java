package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStream1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 8, 90, 89, 2, 7, 10, 1, 90);

		System.out.println("***************** List ************************");
		System.out.println(numbers);
//create the 2nd list using the above list and 2nd list should contain the square of each
//num 
		List<Integer> numbers1 = new ArrayList<Integer>();
		for (int n : numbers) {
			numbers1.add(n * n);

		}
		System.out.println(numbers1);

		// the above using stream
		System.out.println("***************** SQUARE ************************");
		// map() is used what we want to add
		// collect() is used where we want to add
		List<Integer> result = numbers.stream().map(num -> num * num).collect(Collectors.toList());
		System.out.println(result);

		Set<Integer> result2 = numbers.stream().map(num -> num + 10).collect(Collectors.toSet());
		System.out.println(result2);

		// add even nums only
		System.out.println("***************** Even ************************");
		result = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(result);

		// add odd nums only
		System.out.println("***************** odd ************************");
		result = numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		System.out.println(result);

		// sort the list , don't modify the list creates a new one
		System.out.println("***************** Sort ************************");
		result = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(result);

		System.out.println("***************** Reverse Sort ************************");
		result = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(result);

		// remove duplicates and sort
		System.out.println("***************** Sort & Duplicate ************************");
		result = numbers.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(result);

		// atleast 1 even num
		boolean hasAnyEven = numbers.stream().anyMatch(i -> i % 2 == 0);
		System.out.println(hasAnyEven);

		// check if every num is positive
		System.out.println("***************** allMatch   ************************");
		boolean allPositive = numbers.stream().allMatch(i -> i > 0);
		System.out.println(allPositive);

		System.out.println("***************** hasNoMatch   ************************");
		boolean hasNoMatch = numbers.stream().noneMatch(i -> i % 13 == 0);
		System.out.println(hasNoMatch);

	}
}
