package exceptionhandling;

public class Test {
	public static void main(String[] args) {
		/*int num1 = 20;
		int num2 = 0;

		int x = num1 / num2;
		System.out.println(x);
		System.out.println("Program ends");
		//the following program fails due to exception and 
		//java is creating the arithmetic exception object
		*/
		//input two nums
		int num1 = 20;
		int num2 = 0;

		try {
			// possibility of exception due to divide by zero
			int x = num1 / num2;
			System.out.println(x);
		} catch (ArithmeticException ex) {
			// ex.printStackTrace();
			System.out.println("invalid arithmetic operation"
					+ ex.getMessage());
		} 
		finally {
			System.out.println("Program ends");
		}
	}

	}


