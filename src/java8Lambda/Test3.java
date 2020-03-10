package java8Lambda;

public class Test3 {
	interface MathCalc {
		int add(int a, int b);
	}

	public static void main(String[] args) {
		//lambda can be used only if there is only one method -- used in functional 
		//interface
		MathCalc m1 = (int x, int y)->{
			int sum = x + y;
			return sum;
		};
		int r = m1.add(20, 30);
		System.out.println(r);
		
		
		MathCalc m2 = (c, v)->{
			int sub = c -v;
			return sub;
		};
		System.out.println(m2.add(34, 20));
		

	}
}
