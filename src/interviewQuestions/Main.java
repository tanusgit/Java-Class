package interviewQuestions;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		atm();

	}
	
	public static void atm() {
		while(true) {
			menu();
			if(input == 4) {
				break;
			}
		}
	}

	static Scanner m = new Scanner(System.in);
	static int input = 0;
	static int balance = 0;

	public static void menu() {
		System.out.println("enter 1 to check balance: ");
		System.out.println("enter 2 to withdraw balance: ");
		System.out.println("enter 3 to deposit balance: ");
		System.out.println("enter 4 to exit balance: ");

		input = m.nextInt();
		if (input == 1) {
			check();
		} else if (input == 2) {
			withdraw();
		} else if (input == 3) {
			deposit();
		} else if (input == 4) {
			exit();
		} else {
			System.out.println("please enter a valid num");
		}
	}

	private static void exit() {
		// TODO Auto-generated method stub
		return;

	}

	private static void deposit() {
		// TODO Auto-generated method stub
		System.out.println("how much you wish to deposit?");
		input = m.nextInt();
		balance = balance + input;
		System.out.println("your current balance is " + balance);
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("how much you wish to withdraw?");
		input = m.nextInt();
		balance = balance - input;
		System.out.println("your current balance is " + balance);

	}

	private static void check() {
		// TODO Auto-generated method stub
		System.out.println("your current balance is " + balance);

	}

}
