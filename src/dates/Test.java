package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		// display dates import java.util packages
		// the current get
		Date d1 = new Date();
		System.out.println("date is " + d1);
		// milliseconds to date object
		// milliseconds is always a long
		Date d2 = new Date(111111111111L);
		System.out.println("Date is " + d2);

		// date for any months any date
		Date d3 = new Date(2017, 1, 21);
		Date d4 = new Date();
		Date d5 = new Date(2020, 11, 3);

		System.out.println(d3.after(d1));

		System.out.println(d3.before(d2));
		//1 when second date is greater than the first one
		System.out.println(d1.compareTo(d2));
		
	
		
		  
		
	}
}
