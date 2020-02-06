package atm;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		ATM m = new ATM();
	}

	Scanner sc = new Scanner(System.in);
	int balance = 100;
	int deposit = 0;
	int totalDeposit = 0;
	int withdraw = 0;

	public ATM() {
		menu();
	}

	public void menu() {
		while (true) {
			System.out.println("w: withdraw");
			System.out.println("d: deposit");
			System.out.println("h: show transaction history");
			System.out.println("c: current balance");
			System.out.println("e: exit");
			String input = sc.next();
			if (input.equalsIgnoreCase("e")) {
				break;
			} else if (input.equalsIgnoreCase("w")) {
				withdraw();
			} else if (input.equalsIgnoreCase("d")) {
				deposit();
			} else if (input.equalsIgnoreCase("h")) {
				history();
			} else if (input.equalsIgnoreCase("c")) {
				currentBalance();
			} else
				System.out.println("You have to press the right option");
		}
	}

	// cannot withdraw more than 40000
	private void withdraw() {
		System.out.println("How much do you wish to withdraw?");
		withdraw = sc.nextInt();
		if (withdraw > balance) {
			System.out.println("You cannot withdraw more than that " + "you have in your account");
		} else if (withdraw > 40000) {
			System.out.println("You cannot withdraw more than 40000");
		} else {
			balance = balance - withdraw;
			System.out.println("You have " + balance + " left in your account.");
		}

	}

	// cannot deposit more than 50000
	private void deposit() {
			System.out.println("How much do you wish to deposit?");
			deposit = sc.nextInt();

			if (deposit < 0) {
				System.out.println("You cannot deposit negative value");
				return;
			}
			if (deposit >= 50000) {
				System.out.println("You cannot deposit more than 50000");
				return;
			}
			if(balance > 50000) {
					System.out.println("You cannot deposit more than 50000");
				}
			else
				balance = balance + deposit;
				System.out.println("You have " + balance + "  in your account.");
			}
		

	// will show the history of the all transaction
	private void history() {
		// TODO Auto-generated method stub

	}

	// will show the current balance
	private void currentBalance() {
		System.out.println("current balance is " + balance);
		// TODO Auto-generated method stub

	}

}
