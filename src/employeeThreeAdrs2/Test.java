package employeeThreeAdrs2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Test.howmnayTimes(2);
	}
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void setData2() {
		String array[] = new String[5];
		System.out.println("enter ");
		for(int i = 0; i < 5 ; i++) {
			String input = sc.nextLine();
			array[i] = input;
			
		}
		System.out.println(array.toString());
		}
	
	public static void howmnayTimes(int num) {
		for(int i = 0; i < num ; i++) {
			setData2();
		}
		
	}
	

}
