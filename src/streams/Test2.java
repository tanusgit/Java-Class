package streams;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		// Ex1
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i <= 500; i++)
			myList.add(i);

		System.out.println("*******process sequential**********");
		myList.stream().
		filter(p -> p % 2==0).forEach(p -> System.out.println("Even = " + p));
  
		System.out.println("*******process parallel**********");
		myList.parallelStream().filter(p -> p%2==0).forEach
		(p -> System.out.println("Even = " + p));



}
}
