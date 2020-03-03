package generics;

public class Test3 {
//write a generic method which takes generic data as input
//and return strings as a return type
//
	public static void main(String[] args) {
			String a1 = getData(1);
			String a2 =getData("hello");
			String a3 =getData(12.242424f);
			String a4= getData(1141414141414144141l);
			String a5 =getData(2424242.242424244242d);
			String a6 =getData('h');
			
			
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
			System.out.println(a5);
			System.out.println(a6);
		
	}
//returning string but taking any data type T is a template and string is the return type
	public static <T> String getData(T data) {
		return "your data=" + data;
	}
}
