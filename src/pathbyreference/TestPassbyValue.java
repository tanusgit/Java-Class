package pathbyreference;

public class TestPassbyValue {
	public static void main(String[] args) {
		int x= 10;
		System.out.println(x);
		//this is not x it is just the value of x
		//passing the value of x, not the entire x
		modify(x);
		
		System.out.println(x);
	}
	
	private static void modify(int num){
		//num = x
		num = 90;
	}

}
