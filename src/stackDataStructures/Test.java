package stackDataStructures;

import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("user1");
		//topElement(s);
		s.push("user2");
		//topElement(s);
		s.push("user3");
		//topElement(s);
		s.push("user4");
		topElement(s);
		
		String removeElement = s.pop();
		System.out.println("element removed is: " + removeElement);

		topElement(s);

		removeElement = s.pop();
		System.out.println("element removed is: " + removeElement);

		topElement(s);

	}

	public static void topElement(Stack<String> s) {
		String current = s.peek();
		System.out.println("top: " + current);

	}

}
