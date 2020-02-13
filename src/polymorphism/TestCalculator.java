package polymorphism;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int res = c.add(2,3);
		System.out.println(res);
		
		
		int res2 = c.add(2,3, 4);
		System.out.println(res2);
		
		long res3 = c.add(20000000000000000L,300000000000000000L);
		System.out.println("long" + res3);
		
		float res4 = c.add(2f,3f);
		System.out.println(res4);
		
		c.add(2,3f);
		
		c.add(5f,3);
		
		
		
	}
	

}
