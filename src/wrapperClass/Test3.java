package wrapperClass;

public class Test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// converting String to int
		String intStr = "12";
		//will throw exception because we cannot  convert string to int
		//String intStr = "abc";
		
		int fromInt = Integer.parseInt(intStr);

		//converting String to float
		String floatstr = "134.00";
		float fromfloat = Float.parseFloat(floatstr);
		// converting String to double
		String doubleStr = "346.00567";
		double fromdouble = Double.parseDouble(doubleStr);

		// converting String to long
		String longStr = "346877997";
		long fromlong = Long.parseLong(longStr);

		System.out.println("To data types  =" + fromInt + "_" + fromfloat + "_" + fromdouble + "_" + fromlong);

	}

}
