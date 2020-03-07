package thread;

import java.util.Scanner;

public class CalculatorThread extends Thread {

	private String operation;

	private int num1;

	private int num2;

	public CalculatorThread(String operation, int num1, int num2) {
		this.operation = operation;
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {
		if (operation.equals("add")) {
			System.out.println("add " + (num1 + num2));
		} else if (operation.equals("sub")) {
			System.out.println("sub " + (num1 - num2));
		} else if (operation.equals("mul")) {
			System.out.println("mul " + num1 * num2);
		} else if (operation.equals("div")) {
			System.out.println("div " + num1 / num2);
		}
	}




 	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 nums");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		CalculatorThread t1 = new CalculatorThread("add", num1, num2);
		CalculatorThread t2 = new CalculatorThread("sub", num1, num2);
		CalculatorThread t3 = new CalculatorThread("mul", num1, num2);
		CalculatorThread t4 = new CalculatorThread("div", num1, num2);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		System.out.println("end");
		 
	}

}

