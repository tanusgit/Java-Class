package interviewQuestions;
/*
 * 
//function signature
//return statement 
//return type like void and int can determine if it is a function
 */
/*
 * tokenize
 * brace matching
 * Assumption: Program has no comments
 * No generics
 * no throw statement
 * every function has public/private qualifier
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FindFunctions {
	public static void main(String[] args) throws FileNotFoundException {
		int m = find("/home/td/Desktop/Java/AtmProject/src/interviewQuestions/FindFunctions.java");
		System.out.println(m);

	}
	public static int find(String filename) throws FileNotFoundException {
		int num = 0;
		int paren1 = '(';
		int paren2 = ')';
		int lineNum = 0;
		ArrayList<String> array = new ArrayList<>();

		FileInputStream fis = new FileInputStream(filename);
		Scanner scanner = new Scanner(fis);
		while (scanner.hasNextLine()) {
			//String line = scanner.nextLine();
			String line = scanner.next();
			array.add(line);
			if (line.contains("return")||line.contains("void")) {
				//System.out.println("line at: "+ line);
				lineNum++;
			}
			//System.out.println(line);
			for(String m : array) {
				System.out.println(m);
			}
		}
		return lineNum;
	}
	
	
	

	public void add() {

	}

	public int sub() {
		return 0;
	}

}
