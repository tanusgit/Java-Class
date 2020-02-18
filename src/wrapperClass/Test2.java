package wrapperClass;

public class Test2 {

	public static void main(String[] args) {

		// input for primitive data types
		int intValue = 5;
		String intToStrValue = String.valueOf(intValue);

		float floatValue = 23f;
		String floatToStrValue = String.valueOf(floatValue);

		double doubleValue = 12D;
		String doubleToStrValue = String.valueOf(doubleValue);

		long longValue = 56l;
		String longToStrValue = String.valueOf(longValue);

		System.out.println(
				"To String =" + intToStrValue + "_" + 
		floatToStrValue + "_" + doubleToStrValue + "_" + longToStrValue);
		System.out.println(intToStrValue);
	}
}
