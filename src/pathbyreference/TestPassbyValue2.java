package pathbyreference;

public class TestPassbyValue2 {
	public static void main(String[] args) {
		int x= 90;
		  System.out.println(x);
		  //90
		  int y =x;
		  System.out.println(y);
		  //90
		  y =45;
		  System.out.println(x);
		  //90
		  System.out.println(y);
		  //45
	}

}
