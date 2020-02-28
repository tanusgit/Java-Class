package enum1;

public class Test {
	public static void main(String[] args) {
		ColorType c = ColorType.BLACK;
		System.out.println(c);

		// get all objs
		ColorType[] objs = ColorType.values();
		for (ColorType obj : objs) {
			System.out.println(obj);
		}
	}
}
