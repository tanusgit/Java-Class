package polymorphism;

public class TestData2 {
public static void main(String[] args) {
	Data2 d = new Data2();
	System.out.println(d.add(5f, 8f));
	System.out.println(d.add(77777777777777l, 8888888888l));
	//method accept long can also accept int
	//method accept double can also accept int, long, float
	//double is bigger than float
	System.out.println(d.add(5,6));
}
}
