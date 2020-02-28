package dates;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test3 {
//converting a string to a date object
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-11-2001 11:12:56";
		Date date = sdf.parse(dateInString);
		System.out.println(date);
	}
}
