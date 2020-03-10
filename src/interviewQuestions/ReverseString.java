package interviewQuestions;

import java.util.Scanner;

public class ReverseString {
	/*
	 * to reverse the contents of a string Input: Tanu output: unaT
	 * 
	 * We have to find the length of the string use a for loop to go over all the
	 * characters in that string length() tells us how many characters are there in
	 * that string make a new string and initialize as empty string we will copy all
	 * the characters in the new string in a reverse order to make a new String
	 *
	 
	 * 
	 */
	public static void main(String[] args) {
		reverseString("Tanu");

		System.out.println("Enter a String");
		String s = new Scanner(System.in).next();
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		//String s1 = new String(sb);
		//System.out.println(s1);
	}

	private static void reverseString(String name) {
		int l = name.length();
		String result = "";
		for (int i = l - 1; i >= 0; i--) {
			result = result + name.charAt(i);
		}
		System.out.println(result);

	}
}
