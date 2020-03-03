package generics;

public class Test4 {
	//write a generic method that takes generic data as an input and return the generic
	//data
	
	public static void main(String[] args) {
		int a1 = getData(1);
		String a2 =getData("hello");
		float a3 =getData(12.242424f);
		long a4= getData(1141414141414144141l);
		double a5 =getData(2424242.242424244242d);
		char a6 =getData('h');
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		
	}
	//T is the return type
	public static <T> T getData(T data) {
		return data;
	}
	
	//returning string but taking any data type T is a template and string is the return type
		public static <T> String getData1(T data) {
			return "your data=" + data;
		}

}
